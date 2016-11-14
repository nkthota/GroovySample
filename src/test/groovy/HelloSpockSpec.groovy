import common.lib.RestCall

class HelloSpockSpec extends spock.lang.Specification {
    def "sample spock example"() {
        expect:
        new RestCall().GetMethod().indexOf('1478223451069') != -1
    }
}  