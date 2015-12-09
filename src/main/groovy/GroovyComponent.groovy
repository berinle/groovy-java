class GroovyComponent {
  def helloWorld() {
    println 'hello world!'

    def proc = ['/bin/zsh', '-c', '/usr/local/bin/docker-machine ls'].execute()
    def sout = new StringBuilder(), serr = new StringBuilder()

    proc.waitForProcessOutput(sout, serr)

    println sout
    println "--------------------\n"
    println serr

    println 'done calling shell script'
  }
}
