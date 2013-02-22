package se.ithuset.emil;

/**
 * Created by IntelliJ IDEA.
 * User: emilsandin
 * Date: 2013-02-21
 * Time: 21.24
 * To change this template use File | Settings | File Templates.
 */

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class PersonResource extends ServerResource {

    @Get
    public String represent() {
        return "hello, world";
    }

}