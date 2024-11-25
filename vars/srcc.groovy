import org.foo.Bar

def call(String name) {
    echo Bar.greet(name)  // Use the class method
    echo "Sum: ${Bar.add(5, 7)}"  // Use another class method
}
