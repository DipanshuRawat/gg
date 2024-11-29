def call() {
    sh """
    ansiblePlaybook(
                        credentialsId: '1dfb88aa-b117-42bf-a70a-12e98a81d7d1',
                        disableHostKeyChecking: true,
                        installation: 'ansible',
                        inventory: 'workspace/resources/org/foo/aws_ec2.yml',
                        playbook: 'workspace/resources/org/foo/installmongo.yml',
                        vaultTmpPath: ''
                    )
    """
}
