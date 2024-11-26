def call(Map params = [:]) {
    def playbook = params.get('playbook', 'resources/org/foo/installmongo.yml')
    def inventory = params.get('inventory', 'resources/org/foo/hosts')

    sh """
    ansible-playbook -i ${inventory} ${playbook}
    """
}
