def createMavenProject(){
    def mavenCommand = "mvn archetype:generate -DgroupId=com.tarea.app -DartifactId=hola-mundo -DinteractiveMode=false"
    sh "${mavenCommand}"
}



def check(){
    checkout scm
}


def crPackage(){
    def mavenCommand = "mvn clean package"
    sh "${mavenCommand}"
}


def testUni{
    def mavenCommand = "mvn test"
    sh "${mavenCommand}"
}

def jacoco{
    def mavenCommand = "mvn clean test jacoco:report"
    sh "${mavenCommand}"
}
