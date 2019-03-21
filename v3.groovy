job('job-v3') {
    scm {
        git('https://github.com/maximejosien/VirtualisationEnigma', "v3") { node ->
            node / gitConfigName('Maxime')
            node / gitConfigEmail('maxime.josien@estiam.com')
        }
    }
    triggers {
        scm('H/60 * * * *')
    }
    steps {
        shell("git clone https://github.com/Akasam/samplephpwebsite.git")
        shell("git checkout v3")
        shell("phpunit TestProject.php")
    }
}
