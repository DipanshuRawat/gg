// Inside your shared library (my-Library)
def call(Map params = [:]) {
    def playbook = params.get('playbook', 'resources/org/foo/installmongo.yml')  // Default if not passed
    def inventory = params.get('inventory', 'resources/org/foo/hosts')  // Default if not passed

    // Fetch SSH key from Jenkins credentials
    def sshKey = params.get('sshKey', credentials('3d11f520-4c0f-4e15-acd0-404b4398863d'))  // Replace with your credential ID

    sh """
        ansible-playbook -i ${inventory} ${playbook} --private-key ${sshKey}
    """
}
