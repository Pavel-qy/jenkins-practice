pipeline {
    agent any
    stages {
        stage('Initialize') {
            steps {
                script {
                    // Load the external Groovy script
                    def pipelineScript = load 'pipeline.groovy'
                    
                    // Call methods from the loaded script
                    pipelineScript.call()
                }
            }
        }
    }
}
