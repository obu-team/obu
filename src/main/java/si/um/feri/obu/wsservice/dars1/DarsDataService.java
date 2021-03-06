
package si.um.feri.obu.wsservice.dars1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DarsDataService", targetNamespace = "http://um.si/SOA/v2/12/2015")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DarsDataService {


    /**
     * 
     * @return
     *     returns si.um.feri.obu.wsservice.dars1.ArrayOfZapora
     */
    @WebMethod(operationName = "PridobiVseZapore", action = "http://um.si/SOA/v2/12/2015/DarsDataService/PridobiVseZapore")
    @WebResult(name = "PridobiVseZaporeResult", targetNamespace = "http://um.si/SOA/v2/12/2015")
    @RequestWrapper(localName = "PridobiVseZapore", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiVseZapore")
    @ResponseWrapper(localName = "PridobiVseZaporeResponse", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiVseZaporeResponse")
    public ArrayOfZapora pridobiVseZapore();

    /**
     * 
     * @param avtocesta
     * @return
     *     returns si.um.feri.obu.wsservice.dars1.ArrayOfZapora
     */
    @WebMethod(operationName = "PridobiZapore", action = "http://um.si/SOA/v2/12/2015/DarsDataService/PridobiZapore")
    @WebResult(name = "PridobiZaporeResult", targetNamespace = "http://um.si/SOA/v2/12/2015")
    @RequestWrapper(localName = "PridobiZapore", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiZapore")
    @ResponseWrapper(localName = "PridobiZaporeResponse", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiZaporeResponse")
    public ArrayOfZapora pridobiZapore(
        @WebParam(name = "avtocesta", targetNamespace = "http://um.si/SOA/v2/12/2015")
        Avtocesta avtocesta);

    /**
     * 
     * @param lokacija
     * @return
     *     returns si.um.feri.obu.wsservice.dars1.ArrayOfZapora
     */
    @WebMethod(operationName = "PridobiZaporeNaPoti", action = "http://um.si/SOA/v2/12/2015/DarsDataService/PridobiZaporeNaPoti")
    @WebResult(name = "PridobiZaporeNaPotiResult", targetNamespace = "http://um.si/SOA/v2/12/2015")
    @RequestWrapper(localName = "PridobiZaporeNaPoti", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiZaporeNaPoti")
    @ResponseWrapper(localName = "PridobiZaporeNaPotiResponse", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiZaporeNaPotiResponse")
    public ArrayOfZapora pridobiZaporeNaPoti(
        @WebParam(name = "lokacija", targetNamespace = "http://um.si/SOA/v2/12/2015")
        Lokacija lokacija);

    /**
     * 
     * @param lokacija
     * @return
     *     returns si.um.feri.obu.wsservice.dars1.VremenskaNapoved
     */
    @WebMethod(operationName = "PridobiVremenskoNapovedNaPoti", action = "http://um.si/SOA/v2/12/2015/DarsDataService/PridobiVremenskoNapovedNaPoti")
    @WebResult(name = "PridobiVremenskoNapovedNaPotiResult", targetNamespace = "http://um.si/SOA/v2/12/2015")
    @RequestWrapper(localName = "PridobiVremenskoNapovedNaPoti", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiVremenskoNapovedNaPoti")
    @ResponseWrapper(localName = "PridobiVremenskoNapovedNaPotiResponse", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiVremenskoNapovedNaPotiResponse")
    public VremenskaNapoved pridobiVremenskoNapovedNaPoti(
        @WebParam(name = "lokacija", targetNamespace = "http://um.si/SOA/v2/12/2015")
        Lokacija lokacija);

    /**
     * 
     * @param avtocesta
     * @return
     *     returns si.um.feri.obu.wsservice.dars1.VremenskaNapoved
     */
    @WebMethod(operationName = "PridobiVremenskoNapoved", action = "http://um.si/SOA/v2/12/2015/DarsDataService/PridobiVremenskoNapoved")
    @WebResult(name = "PridobiVremenskoNapovedResult", targetNamespace = "http://um.si/SOA/v2/12/2015")
    @RequestWrapper(localName = "PridobiVremenskoNapoved", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiVremenskoNapoved")
    @ResponseWrapper(localName = "PridobiVremenskoNapovedResponse", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiVremenskoNapovedResponse")
    public VremenskaNapoved pridobiVremenskoNapoved(
        @WebParam(name = "avtocesta", targetNamespace = "http://um.si/SOA/v2/12/2015")
        Avtocesta avtocesta);

    /**
     * 
     * @param ime
     * @return
     *     returns si.um.feri.obu.wsservice.dars1.Prehod
     */
    @WebMethod(operationName = "StanjePrehoda", action = "http://um.si/SOA/v2/12/2015/DarsDataService/StanjePrehoda")
    @WebResult(name = "StanjePrehodaResult", targetNamespace = "http://um.si/SOA/v2/12/2015")
    @RequestWrapper(localName = "StanjePrehoda", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.StanjePrehoda")
    @ResponseWrapper(localName = "StanjePrehodaResponse", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.StanjePrehodaResponse")
    public Prehod stanjePrehoda(
        @WebParam(name = "ime", targetNamespace = "http://um.si/SOA/v2/12/2015")
        String ime);

    /**
     * 
     * @param lokacija
     * @return
     *     returns si.um.feri.obu.wsservice.dars1.BencinskaCrpalka
     */
    @WebMethod(operationName = "PridobiNaslednjoBencinskoCrpalko", action = "http://um.si/SOA/v2/12/2015/DarsDataService/PridobiNaslednjoBencinskoCrpalko")
    @WebResult(name = "PridobiNaslednjoBencinskoCrpalkoResult", targetNamespace = "http://um.si/SOA/v2/12/2015")
    @RequestWrapper(localName = "PridobiNaslednjoBencinskoCrpalko", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiNaslednjoBencinskoCrpalko")
    @ResponseWrapper(localName = "PridobiNaslednjoBencinskoCrpalkoResponse", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiNaslednjoBencinskoCrpalkoResponse")
    public BencinskaCrpalka pridobiNaslednjoBencinskoCrpalko(
        @WebParam(name = "lokacija", targetNamespace = "http://um.si/SOA/v2/12/2015")
        Lokacija lokacija);

    /**
     * 
     * @param lokacija
     * @param naziv
     * @return
     *     returns si.um.feri.obu.wsservice.dars1.BencinskaCrpalka
     */
    @WebMethod(operationName = "PridobiNaslednjoBencinskoCrpalkoNaNaziv", action = "http://um.si/SOA/v2/12/2015/DarsDataService/PridobiNaslednjoBencinskoCrpalkoNaNaziv")
    @WebResult(name = "PridobiNaslednjoBencinskoCrpalkoNaNazivResult", targetNamespace = "http://um.si/SOA/v2/12/2015")
    @RequestWrapper(localName = "PridobiNaslednjoBencinskoCrpalkoNaNaziv", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiNaslednjoBencinskoCrpalkoNaNaziv")
    @ResponseWrapper(localName = "PridobiNaslednjoBencinskoCrpalkoNaNazivResponse", targetNamespace = "http://um.si/SOA/v2/12/2015", className = "si.um.feri.obu.wsservice.dars1.PridobiNaslednjoBencinskoCrpalkoNaNazivResponse")
    public BencinskaCrpalka pridobiNaslednjoBencinskoCrpalkoNaNaziv(
        @WebParam(name = "lokacija", targetNamespace = "http://um.si/SOA/v2/12/2015")
        Lokacija lokacija,
        @WebParam(name = "naziv", targetNamespace = "http://um.si/SOA/v2/12/2015")
        String naziv);

}
