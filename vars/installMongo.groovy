// Inside your shared library (vars/installMongo.groovy)
def call(Map params = [:]) {
    def playbook = params.get('playbook', 'resources/org/foo/installmongo.yml')  // Default playbook path
    def inventory = params.get('inventory', 'resources/org/foo/hosts')          // Default inventory path
    def credentialsId = params.get('sshKey', '1dfb88aa-b117-42bf-a70a-12e98a81d7d1') // Credential ID

    // Use Jenkins credentials securely
    withCredentials([sshUserPrivateKey(credentialsId: credentialsId)]) {
        sh """
            ansible-playbook -i ${inventory} ${playbook} \
                             --private-key=${SSH_KEY}
        """
    }
}
