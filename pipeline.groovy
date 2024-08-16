def command = "python3.11 /code/jenkins-practice/test_case.py"
def maxRetries = 3
def retryCount = 0
def success = false

while (retryCount < maxRetries && !success) {
    def process = command.execute()

    // Capture the output and error streams
    def outputStream = new StringBuffer()
    def errorStream = new StringBuffer()
    process.consumeProcessOutput(outputStream, errorStream)

    // Wait for the process to complete
    process.waitFor()

    // Get the exit status
    def exitStatus = process.exitValue()

    if (exitStatus == 0) {
        println("Process completed successfully")
        println("Output: ${outputStream.toString()}")
        success = true
    } else {
        println("Process failed with exit status: ${exitStatus}")
        println("Error: ${errorStream.toString()}")
        retryCount++
        if (retryCount < maxRetries) {
            println("Retrying... (${retryCount}/${maxRetries})")
        } else {
            println("Max retries reached. Exiting.")
        }
    }
}

if (!success) {
    throw new RuntimeException("Process failed after ${maxRetries} retries")
}

return this
