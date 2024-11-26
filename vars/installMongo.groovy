def call() {
    pipeline {
        agent any

        stages {
            stage('Install MongoDB') {
                steps {
                    script {
                        // Execute the Ansible playbook
                        ansiblePlaybook(
                            playbook: "${libraryResource('org/foo/installmongo.yml')}",
                            inventory: 'hosts.ini' // Provide your Ansible inventory file here
                        )
                    }
                }
            }
        }
    }
}
