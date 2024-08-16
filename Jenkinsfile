node {
    checkout scm 
    sh 'ls -la'
    def pipelineScript = load "pipeline.groovy"
    pipelineScript.call()
}
