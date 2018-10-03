package formator;


import formator.fjson.JBuildObject;
import formator.fjson.JDepObject;
import formator.fxml.XBuildObject;
import formator.fxml.XDepObject;
import formator.spreadsheet.Csvgrapher;

public class Formator {
    private MapObject mapObject;
    private Csvgrapher csvgrapher;

    public Formator(String[] depTypes) {

        mapObject = new MapObject(depTypes);
    }

    public XDepObject getfXmlDataModel() {
        XBuildObject xBuildObject = new XBuildObject();
        XDepObject xDepObject = xBuildObject.buildObjectProcess(mapObject);
        return xDepObject;
    }

    public JDepObject getfJsonDataModel() {
        JBuildObject jBuildObject = new JBuildObject();
        JDepObject jDepObject = jBuildObject.buildObjectProcess(mapObject);
        return jDepObject;

        //JsonWriter jasonFormat = new JsonWriter();
        //jasonFormat.toJson(jDepObject);

        //XmlWriter xmlFormat = new XmlWriter();
        //xmlFormat.toXml(xDepObject);
    }


}
