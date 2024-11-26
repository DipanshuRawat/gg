def call(Map args = [:]) {
    def configFile = args.get('configFile', 'config/mongoDeployConfig.yml')

    stage('User Approval') {
        input message: "Approve MongoDB Deployment?"
    }

    stage('Execute Ansible Playbook') {
        script {
            def config = readYaml(file: configFile)
            ansiblePlaybook(
                playbook: "${libraryResource('org/foo/installmongo.yml')}",
                inventory: config.inventoryFile
            )
        }
    }
}
