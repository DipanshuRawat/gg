def call(String name) {
    def json = libraryResource('org/foo/bar.json')  // Load resource file
    def data = new groovy.json.JsonSlurper().parseText(json)  // Parse JSON
    
    echo "${data.greeting}, ${name}!"  // Outputs: Hello, <name>!
}
