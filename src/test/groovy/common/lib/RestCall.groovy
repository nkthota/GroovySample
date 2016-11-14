package common.lib
import groovy.json.JsonParserType
import groovy.json.JsonSlurper
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

public class RestCall{
    def String GetMethod()
    {
        OkHttpClient client = new OkHttpClient()
        Request request = new Request.Builder()
                .url('http://wqqmoautoportal/qmoportal/api/v1/results/ARD/Env_Val_UAT/by/story')
                .build()
        Response response = client.newCall(request).execute()
        return  response.body().string()
    }
}