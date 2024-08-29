## Docker Command

To run a Docker container for your current project, follow these steps:

1. Make sure you have Docker installed on your machine. If not, you can download and install it from the official Docker website.

2. Open a terminal or command prompt and navigate to the root directory of your project.

3. Run docker container

    ```shell
    docker run -p 8080:8080 -p 50000:50000 --restart=on-failure -v jenkins_home:/var/jenkins_home -v /d/code/jenkins-practice:/code/jenkins-practice -e JAVA_OPTS="-Dhudson.plugins.git.GitSCM.ALLOW_LOCAL_CHECKOUT=true" --name jenkins-practice jenkins/jenkins:lts-jdk17
    ```

    This command will run a Docker container named "jenkins-practice" based on the jenkins/jenkins:lts-jdk17 image.

4. Once the container is created, you can run it using the following command:

    ```
    docker start jenkins-practice
    ```

    This command will start an existing container with the name "jenkins-practice".

5. You can now access your project by opening a web browser and navigating to `http://localhost:8080`.
