package rest
import groovy.json.JsonParserType
import groovy.json.JsonSlurper
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

public class RestGet {
    public static void main(String... args) {
        OkHttpClient client = new OkHttpClient()
        Request request = new Request.Builder()
                .url('http://wqqmoautoportal/qmoportal/api/v1/results/ARD/Env_Val_UAT/by/story')
                .build()
        Response response = client.newCall(request).execute()
        def jsonText = response.body().string()
        println jsonText

        def parser = new JsonSlurper().setType(JsonParserType.LAX)
        Object jsonResp = parser.parseText(jsonText)
        jsonResp.each {
            println it[2]
        }
    }
}

