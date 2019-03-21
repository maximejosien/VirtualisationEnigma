job('job-v2') {
    scm {
        git('https://github.com/maximejosien/VirtualisationEnigma', "v2") { node ->
            node / gitConfigName('Maxime')
            node / gitConfigEmail('maxime.josien@estiam.com')
        }
    }
    triggers {
        scm('H/60 * * * *')
    }
    steps {
        shell("git@github.com:Akasam/samplephpwebsite.git")
        shell("git checkout v2")
        shell("phpunit TestProject.php")
    }
}
