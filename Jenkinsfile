pipeline {
    agent any 
    environment {
        DB_LOC = credentials("CB_DB_LOC")
        UTOPIA_DB_UNAME = credentials("CB_DB_USER")
        UTOPIA_DB_PASS = credentials("CB_DB_PASS")
        AWS_CLI = '/usr/local/bin/aws'
        PLACEHOLDER = 'v '
    }
    stages {
        stage('build and scan') { 
            steps {
                sh 'echo "hello"'
                withSonarQubeEnv('sonarqube'){
                    sh 'mvn verify sonar:sonar -Dsonar.projectKey=cb-booking -Dsonar.host.url=http://jenkins.hitec.link:9000/ -Dsonar.login=3b4c1716c02efa3ef2d3c1e2d483ffbb714c024c'
                    sh 'echo "hello"'
                }
                sh 'mvn clean install > maven-build.txt'
            }
        }
        stage('dockerize') { 
            steps {
                sh 'docker build -t "jenkins-auto-build-booking:latest" .'
            }
        }
        stage('push to ecr') { 
            steps {
                withAWS(credentials: 'Jenkins', region: 'us-east-2') {
                    sh '$AWS_CLI ecr get-login-password --region us-east-2 | docker login --username AWS --password-stdin 902316339693.dkr.ecr.us-east-2.amazonaws.com'
                    sh 'docker tag jenkins-auto-build-booking:latest 902316339693.dkr.ecr.us-east-2.amazonaws.com/cb-booking:jenkins-auto-build-booking'
                    sh 'docker push 902316339693.dkr.ecr.us-east-2.amazonaws.com/cb-booking:jenkins-auto-build-booking'
                }
            }
        }
    }
}
