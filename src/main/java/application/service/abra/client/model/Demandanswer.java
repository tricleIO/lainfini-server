/**
 * abra gen web api (spojení testapi)
 * webové api systému 17.03.03
 *
 * OpenAPI spec version: 17.03.03
 * Contact: abragen@abra.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package application.service.abra.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * Demandanswer
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Demandanswer   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("posindex")
  private Integer posindex = null;

  @SerializedName("firm_id")
  private String firmId = null;

  @SerializedName("firmoffice_id")
  private String firmofficeId = null;

  @SerializedName("person_id")
  private String personId = null;

  @SerializedName("gotpricesdate$date")
  private DateTime gotpricesdatedate = null;

  @SerializedName("communicationtype_id")
  private String communicationtypeId = null;

  @SerializedName("unitprice")
  private Double unitprice = null;

  @SerializedName("totalprice")
  private Double totalprice = null;

  @SerializedName("tamount")
  private Double tamount = null;

  @SerializedName("localtamount")
  private Double localtamount = null;

  @SerializedName("localuamount")
  private Double localuamount = null;

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("currrate")
  private Double currrate = null;

  @SerializedName("refcurrrate")
  private Double refcurrrate = null;

  @SerializedName("localothercostsratio")
  private Double localothercostsratio = null;

  @SerializedName("validtodate$date")
  private DateTime validtodatedate = null;

  @SerializedName("supplydate$date")
  private DateTime supplydatedate = null;

  @SerializedName("supplyconditions")
  private String supplyconditions = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("unitquantity")
  private Double unitquantity = null;

  @SerializedName("qunit")
  private String qunit = null;

  @SerializedName("unitrate")
  private Double unitrate = null;

  @SerializedName("iswinner")
  private Boolean iswinner = null;

  @SerializedName("issueddemand2_id")
  private String issueddemand2Id = null;

  @SerializedName("demandingstatus")
  private Integer demandingstatus = null;

  @SerializedName("refcurrency_id")
  private String refcurrencyId = null;

  @SerializedName("localrefcurrency_id")
  private String localrefcurrencyId = null;

  @SerializedName("issueddemand_displayname")
  private String issueddemandDisplayname = null;

  @SerializedName("demandfailurereason_id")
  private String demandfailurereasonId = null;

  @SerializedName("demandfailurecomment")
  private String demandfailurecomment = null;

  @SerializedName("storecard_id")
  private String storecardId = null;

  @SerializedName("rowtype")
  private Integer rowtype = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  public Demandanswer displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * název
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "název")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Demandanswer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * vlastní id [persistentní položka]
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "vlastní id [persistentní položka]")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Demandanswer classid(String classid) {
    this.classid = classid;
    return this;
  }

   /**
   * id třídy
   * @return classid
  **/
  @ApiModelProperty(example = "null", value = "id třídy")
  public String getClassid() {
    return classid;
  }

  public void setClassid(String classid) {
    this.classid = classid;
  }

  public Demandanswer objversion(Integer objversion) {
    this.objversion = objversion;
    return this;
  }

   /**
   * verze objektu [persistentní položka]
   * @return objversion
  **/
  @ApiModelProperty(example = "null", value = "verze objektu [persistentní položka]")
  public Integer getObjversion() {
    return objversion;
  }

  public void setObjversion(Integer objversion) {
    this.objversion = objversion;
  }

  public Demandanswer parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu poptávkový list - řádek [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu poptávkový list - řádek [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Demandanswer posindex(Integer posindex) {
    this.posindex = posindex;
    return this;
  }

   /**
   * pořadí [persistentní položka]
   * @return posindex
  **/
  @ApiModelProperty(example = "null", value = "pořadí [persistentní položka]")
  public Integer getPosindex() {
    return posindex;
  }

  public void setPosindex(Integer posindex) {
    this.posindex = posindex;
  }

  public Demandanswer firmId(String firmId) {
    this.firmId = firmId;
    return this;
  }

   /**
   * firma dodavatele; id objektu firma [persistentní položka]
   * @return firmId
  **/
  @ApiModelProperty(example = "null", value = "firma dodavatele; id objektu firma [persistentní položka]")
  public String getFirmId() {
    return firmId;
  }

  public void setFirmId(String firmId) {
    this.firmId = firmId;
  }

  public Demandanswer firmofficeId(String firmofficeId) {
    this.firmofficeId = firmofficeId;
    return this;
  }

   /**
   * provozovna firmy dodavatele; id objektu provozovna [persistentní položka]
   * @return firmofficeId
  **/
  @ApiModelProperty(example = "null", value = "provozovna firmy dodavatele; id objektu provozovna [persistentní položka]")
  public String getFirmofficeId() {
    return firmofficeId;
  }

  public void setFirmofficeId(String firmofficeId) {
    this.firmofficeId = firmofficeId;
  }

  public Demandanswer personId(String personId) {
    this.personId = personId;
    return this;
  }

   /**
   * osoba ve firmě dodavatele; id objektu osoba [persistentní položka]
   * @return personId
  **/
  @ApiModelProperty(example = "null", value = "osoba ve firmě dodavatele; id objektu osoba [persistentní položka]")
  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public Demandanswer gotpricesdatedate(DateTime gotpricesdatedate) {
    this.gotpricesdatedate = gotpricesdatedate;
    return this;
  }

   /**
   * datum zjištění cen od dodavatele [persistentní položka]
   * @return gotpricesdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum zjištění cen od dodavatele [persistentní položka]")
  public DateTime getGotpricesdatedate() {
    return gotpricesdatedate;
  }

  public void setGotpricesdatedate(DateTime gotpricesdatedate) {
    this.gotpricesdatedate = gotpricesdatedate;
  }

  public Demandanswer communicationtypeId(String communicationtypeId) {
    this.communicationtypeId = communicationtypeId;
    return this;
  }

   /**
   * způsob komunikace; id objektu způsob komunikace [persistentní položka]
   * @return communicationtypeId
  **/
  @ApiModelProperty(example = "null", value = "způsob komunikace; id objektu způsob komunikace [persistentní položka]")
  public String getCommunicationtypeId() {
    return communicationtypeId;
  }

  public void setCommunicationtypeId(String communicationtypeId) {
    this.communicationtypeId = communicationtypeId;
  }

  public Demandanswer unitprice(Double unitprice) {
    this.unitprice = unitprice;
    return this;
  }

   /**
   * nabídnutá jednotková cena v měně řádku [persistentní položka]
   * @return unitprice
  **/
  @ApiModelProperty(example = "null", value = "nabídnutá jednotková cena v měně řádku [persistentní položka]")
  public Double getUnitprice() {
    return unitprice;
  }

  public void setUnitprice(Double unitprice) {
    this.unitprice = unitprice;
  }

  public Demandanswer totalprice(Double totalprice) {
    this.totalprice = totalprice;
    return this;
  }

   /**
   * nabídnutá celková cena v měně řádku [persistentní položka]
   * @return totalprice
  **/
  @ApiModelProperty(example = "null", value = "nabídnutá celková cena v měně řádku [persistentní položka]")
  public Double getTotalprice() {
    return totalprice;
  }

  public void setTotalprice(Double totalprice) {
    this.totalprice = totalprice;
  }

  public Demandanswer tamount(Double tamount) {
    this.tamount = tamount;
    return this;
  }

   /**
   * nabídnutá celková cena v měně řádku [persistentní položka]
   * @return tamount
  **/
  @ApiModelProperty(example = "null", value = "nabídnutá celková cena v měně řádku [persistentní položka]")
  public Double getTamount() {
    return tamount;
  }

  public void setTamount(Double tamount) {
    this.tamount = tamount;
  }

  public Demandanswer localtamount(Double localtamount) {
    this.localtamount = localtamount;
    return this;
  }

   /**
   * nabídnutá celková cena v lok.měně [persistentní položka]
   * @return localtamount
  **/
  @ApiModelProperty(example = "null", value = "nabídnutá celková cena v lok.měně [persistentní položka]")
  public Double getLocaltamount() {
    return localtamount;
  }

  public void setLocaltamount(Double localtamount) {
    this.localtamount = localtamount;
  }

  public Demandanswer localuamount(Double localuamount) {
    this.localuamount = localuamount;
    return this;
  }

   /**
   * nabídnutá jednotková cena v lok.měně
   * @return localuamount
  **/
  @ApiModelProperty(example = "null", value = "nabídnutá jednotková cena v lok.měně")
  public Double getLocaluamount() {
    return localuamount;
  }

  public void setLocaluamount(Double localuamount) {
    this.localuamount = localuamount;
  }

  public Demandanswer currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * měna; id objektu měna [persistentní položka]
   * @return currencyId
  **/
  @ApiModelProperty(example = "null", value = "měna; id objektu měna [persistentní položka]")
  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  public Demandanswer currrate(Double currrate) {
    this.currrate = currrate;
    return this;
  }

   /**
   * kurz měny [persistentní položka]
   * @return currrate
  **/
  @ApiModelProperty(example = "null", value = "kurz měny [persistentní položka]")
  public Double getCurrrate() {
    return currrate;
  }

  public void setCurrrate(Double currrate) {
    this.currrate = currrate;
  }

  public Demandanswer refcurrrate(Double refcurrrate) {
    this.refcurrrate = refcurrrate;
    return this;
  }

   /**
   * vztažný kurz měny [persistentní položka]
   * @return refcurrrate
  **/
  @ApiModelProperty(example = "null", value = "vztažný kurz měny [persistentní položka]")
  public Double getRefcurrrate() {
    return refcurrrate;
  }

  public void setRefcurrrate(Double refcurrrate) {
    this.refcurrrate = refcurrrate;
  }

  public Demandanswer localothercostsratio(Double localothercostsratio) {
    this.localothercostsratio = localothercostsratio;
    return this;
  }

   /**
   * poměrná část ostatních výdajů [persistentní položka]
   * @return localothercostsratio
  **/
  @ApiModelProperty(example = "null", value = "poměrná část ostatních výdajů [persistentní položka]")
  public Double getLocalothercostsratio() {
    return localothercostsratio;
  }

  public void setLocalothercostsratio(Double localothercostsratio) {
    this.localothercostsratio = localothercostsratio;
  }

  public Demandanswer validtodatedate(DateTime validtodatedate) {
    this.validtodatedate = validtodatedate;
    return this;
  }

   /**
   * datum platnosti nabídnuté ceny [persistentní položka]
   * @return validtodatedate
  **/
  @ApiModelProperty(example = "null", value = "datum platnosti nabídnuté ceny [persistentní položka]")
  public DateTime getValidtodatedate() {
    return validtodatedate;
  }

  public void setValidtodatedate(DateTime validtodatedate) {
    this.validtodatedate = validtodatedate;
  }

  public Demandanswer supplydatedate(DateTime supplydatedate) {
    this.supplydatedate = supplydatedate;
    return this;
  }

   /**
   * datum možného dodání [persistentní položka]
   * @return supplydatedate
  **/
  @ApiModelProperty(example = "null", value = "datum možného dodání [persistentní položka]")
  public DateTime getSupplydatedate() {
    return supplydatedate;
  }

  public void setSupplydatedate(DateTime supplydatedate) {
    this.supplydatedate = supplydatedate;
  }

  public Demandanswer supplyconditions(String supplyconditions) {
    this.supplyconditions = supplyconditions;
    return this;
  }

   /**
   * dodací podmínky [persistentní položka]
   * @return supplyconditions
  **/
  @ApiModelProperty(example = "null", value = "dodací podmínky [persistentní položka]")
  public String getSupplyconditions() {
    return supplyconditions;
  }

  public void setSupplyconditions(String supplyconditions) {
    this.supplyconditions = supplyconditions;
  }

  public Demandanswer quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * potvrz.mož.počet v jedn.se vzt.1 [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "potvrz.mož.počet v jedn.se vzt.1 [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Demandanswer unitquantity(Double unitquantity) {
    this.unitquantity = unitquantity;
    return this;
  }

   /**
   * potvrzený možný počet
   * @return unitquantity
  **/
  @ApiModelProperty(example = "null", value = "potvrzený možný počet")
  public Double getUnitquantity() {
    return unitquantity;
  }

  public void setUnitquantity(Double unitquantity) {
    this.unitquantity = unitquantity;
  }

  public Demandanswer qunit(String qunit) {
    this.qunit = qunit;
    return this;
  }

   /**
   * jednotka [persistentní položka]
   * @return qunit
  **/
  @ApiModelProperty(example = "null", value = "jednotka [persistentní položka]")
  public String getQunit() {
    return qunit;
  }

  public void setQunit(String qunit) {
    this.qunit = qunit;
  }

  public Demandanswer unitrate(Double unitrate) {
    this.unitrate = unitrate;
    return this;
  }

   /**
   * vztah [persistentní položka]
   * @return unitrate
  **/
  @ApiModelProperty(example = "null", value = "vztah [persistentní položka]")
  public Double getUnitrate() {
    return unitrate;
  }

  public void setUnitrate(Double unitrate) {
    this.unitrate = unitrate;
  }

  public Demandanswer iswinner(Boolean iswinner) {
    this.iswinner = iswinner;
    return this;
  }

   /**
   * vítězný dodavatel [persistentní položka]
   * @return iswinner
  **/
  @ApiModelProperty(example = "null", value = "vítězný dodavatel [persistentní položka]")
  public Boolean getIswinner() {
    return iswinner;
  }

  public void setIswinner(Boolean iswinner) {
    this.iswinner = iswinner;
  }

  public Demandanswer issueddemand2Id(String issueddemand2Id) {
    this.issueddemand2Id = issueddemand2Id;
    return this;
  }

   /**
   * odkaz do řádků poptávek vydaných; id objektu poptávka vydaná - řádek [persistentní položka]
   * @return issueddemand2Id
  **/
  @ApiModelProperty(example = "null", value = "odkaz do řádků poptávek vydaných; id objektu poptávka vydaná - řádek [persistentní položka]")
  public String getIssueddemand2Id() {
    return issueddemand2Id;
  }

  public void setIssueddemand2Id(String issueddemand2Id) {
    this.issueddemand2Id = issueddemand2Id;
  }

  public Demandanswer demandingstatus(Integer demandingstatus) {
    this.demandingstatus = demandingstatus;
    return this;
  }

   /**
   * stav poptávky [persistentní položka]
   * @return demandingstatus
  **/
  @ApiModelProperty(example = "null", value = "stav poptávky [persistentní položka]")
  public Integer getDemandingstatus() {
    return demandingstatus;
  }

  public void setDemandingstatus(Integer demandingstatus) {
    this.demandingstatus = demandingstatus;
  }

  public Demandanswer refcurrencyId(String refcurrencyId) {
    this.refcurrencyId = refcurrencyId;
    return this;
  }

   /**
   * ref.měna; id objektu měna
   * @return refcurrencyId
  **/
  @ApiModelProperty(example = "null", value = "ref.měna; id objektu měna")
  public String getRefcurrencyId() {
    return refcurrencyId;
  }

  public void setRefcurrencyId(String refcurrencyId) {
    this.refcurrencyId = refcurrencyId;
  }

  public Demandanswer localrefcurrencyId(String localrefcurrencyId) {
    this.localrefcurrencyId = localrefcurrencyId;
    return this;
  }

   /**
   * lok.ref.měna; id objektu měna
   * @return localrefcurrencyId
  **/
  @ApiModelProperty(example = "null", value = "lok.ref.měna; id objektu měna")
  public String getLocalrefcurrencyId() {
    return localrefcurrencyId;
  }

  public void setLocalrefcurrencyId(String localrefcurrencyId) {
    this.localrefcurrencyId = localrefcurrencyId;
  }

  public Demandanswer issueddemandDisplayname(String issueddemandDisplayname) {
    this.issueddemandDisplayname = issueddemandDisplayname;
    return this;
  }

   /**
   * poptávka vydaná
   * @return issueddemandDisplayname
  **/
  @ApiModelProperty(example = "null", value = "poptávka vydaná")
  public String getIssueddemandDisplayname() {
    return issueddemandDisplayname;
  }

  public void setIssueddemandDisplayname(String issueddemandDisplayname) {
    this.issueddemandDisplayname = issueddemandDisplayname;
  }

  public Demandanswer demandfailurereasonId(String demandfailurereasonId) {
    this.demandfailurereasonId = demandfailurereasonId;
    return this;
  }

   /**
   * důvod neúspěchu; id objektu důvod neúspěchu oslovených dodavatelů [persistentní položka]
   * @return demandfailurereasonId
  **/
  @ApiModelProperty(example = "null", value = "důvod neúspěchu; id objektu důvod neúspěchu oslovených dodavatelů [persistentní položka]")
  public String getDemandfailurereasonId() {
    return demandfailurereasonId;
  }

  public void setDemandfailurereasonId(String demandfailurereasonId) {
    this.demandfailurereasonId = demandfailurereasonId;
  }

  public Demandanswer demandfailurecomment(String demandfailurecomment) {
    this.demandfailurecomment = demandfailurecomment;
    return this;
  }

   /**
   * poznámky k důvodům neúspěchu [persistentní položka]
   * @return demandfailurecomment
  **/
  @ApiModelProperty(example = "null", value = "poznámky k důvodům neúspěchu [persistentní položka]")
  public String getDemandfailurecomment() {
    return demandfailurecomment;
  }

  public void setDemandfailurecomment(String demandfailurecomment) {
    this.demandfailurecomment = demandfailurecomment;
  }

  public Demandanswer storecardId(String storecardId) {
    this.storecardId = storecardId;
    return this;
  }

   /**
   * skladová karta; id objektu skladová karta
   * @return storecardId
  **/
  @ApiModelProperty(example = "null", value = "skladová karta; id objektu skladová karta")
  public String getStorecardId() {
    return storecardId;
  }

  public void setStorecardId(String storecardId) {
    this.storecardId = storecardId;
  }

  public Demandanswer rowtype(Integer rowtype) {
    this.rowtype = rowtype;
    return this;
  }

   /**
   * typ řádku
   * @return rowtype
  **/
  @ApiModelProperty(example = "null", value = "typ řádku")
  public Integer getRowtype() {
    return rowtype;
  }

  public void setRowtype(Integer rowtype) {
    this.rowtype = rowtype;
  }

  public Demandanswer divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }

   /**
   * středisko; id objektu středisko
   * @return divisionId
  **/
  @ApiModelProperty(example = "null", value = "středisko; id objektu středisko")
  public String getDivisionId() {
    return divisionId;
  }

  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  public Demandanswer busorderId(String busorderId) {
    this.busorderId = busorderId;
    return this;
  }

   /**
   * zakázka; id objektu zakázka
   * @return busorderId
  **/
  @ApiModelProperty(example = "null", value = "zakázka; id objektu zakázka")
  public String getBusorderId() {
    return busorderId;
  }

  public void setBusorderId(String busorderId) {
    this.busorderId = busorderId;
  }

  public Demandanswer bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * obchodní případ; id objektu obchodní případ
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "obchodní případ; id objektu obchodní případ")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Demandanswer busprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
    return this;
  }

   /**
   * projekt; id objektu projekt
   * @return busprojectId
  **/
  @ApiModelProperty(example = "null", value = "projekt; id objektu projekt")
  public String getBusprojectId() {
    return busprojectId;
  }

  public void setBusprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Demandanswer demandanswer = (Demandanswer) o;
    return Objects.equals(this.displayname, demandanswer.displayname) &&
        Objects.equals(this.id, demandanswer.id) &&
        Objects.equals(this.classid, demandanswer.classid) &&
        Objects.equals(this.objversion, demandanswer.objversion) &&
        Objects.equals(this.parentId, demandanswer.parentId) &&
        Objects.equals(this.posindex, demandanswer.posindex) &&
        Objects.equals(this.firmId, demandanswer.firmId) &&
        Objects.equals(this.firmofficeId, demandanswer.firmofficeId) &&
        Objects.equals(this.personId, demandanswer.personId) &&
        Objects.equals(this.gotpricesdatedate, demandanswer.gotpricesdatedate) &&
        Objects.equals(this.communicationtypeId, demandanswer.communicationtypeId) &&
        Objects.equals(this.unitprice, demandanswer.unitprice) &&
        Objects.equals(this.totalprice, demandanswer.totalprice) &&
        Objects.equals(this.tamount, demandanswer.tamount) &&
        Objects.equals(this.localtamount, demandanswer.localtamount) &&
        Objects.equals(this.localuamount, demandanswer.localuamount) &&
        Objects.equals(this.currencyId, demandanswer.currencyId) &&
        Objects.equals(this.currrate, demandanswer.currrate) &&
        Objects.equals(this.refcurrrate, demandanswer.refcurrrate) &&
        Objects.equals(this.localothercostsratio, demandanswer.localothercostsratio) &&
        Objects.equals(this.validtodatedate, demandanswer.validtodatedate) &&
        Objects.equals(this.supplydatedate, demandanswer.supplydatedate) &&
        Objects.equals(this.supplyconditions, demandanswer.supplyconditions) &&
        Objects.equals(this.quantity, demandanswer.quantity) &&
        Objects.equals(this.unitquantity, demandanswer.unitquantity) &&
        Objects.equals(this.qunit, demandanswer.qunit) &&
        Objects.equals(this.unitrate, demandanswer.unitrate) &&
        Objects.equals(this.iswinner, demandanswer.iswinner) &&
        Objects.equals(this.issueddemand2Id, demandanswer.issueddemand2Id) &&
        Objects.equals(this.demandingstatus, demandanswer.demandingstatus) &&
        Objects.equals(this.refcurrencyId, demandanswer.refcurrencyId) &&
        Objects.equals(this.localrefcurrencyId, demandanswer.localrefcurrencyId) &&
        Objects.equals(this.issueddemandDisplayname, demandanswer.issueddemandDisplayname) &&
        Objects.equals(this.demandfailurereasonId, demandanswer.demandfailurereasonId) &&
        Objects.equals(this.demandfailurecomment, demandanswer.demandfailurecomment) &&
        Objects.equals(this.storecardId, demandanswer.storecardId) &&
        Objects.equals(this.rowtype, demandanswer.rowtype) &&
        Objects.equals(this.divisionId, demandanswer.divisionId) &&
        Objects.equals(this.busorderId, demandanswer.busorderId) &&
        Objects.equals(this.bustransactionId, demandanswer.bustransactionId) &&
        Objects.equals(this.busprojectId, demandanswer.busprojectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, firmId, firmofficeId, personId, gotpricesdatedate, communicationtypeId, unitprice, totalprice, tamount, localtamount, localuamount, currencyId, currrate, refcurrrate, localothercostsratio, validtodatedate, supplydatedate, supplyconditions, quantity, unitquantity, qunit, unitrate, iswinner, issueddemand2Id, demandingstatus, refcurrencyId, localrefcurrencyId, issueddemandDisplayname, demandfailurereasonId, demandfailurecomment, storecardId, rowtype, divisionId, busorderId, bustransactionId, busprojectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Demandanswer {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    firmId: ").append(toIndentedString(firmId)).append("\n");
    sb.append("    firmofficeId: ").append(toIndentedString(firmofficeId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    gotpricesdatedate: ").append(toIndentedString(gotpricesdatedate)).append("\n");
    sb.append("    communicationtypeId: ").append(toIndentedString(communicationtypeId)).append("\n");
    sb.append("    unitprice: ").append(toIndentedString(unitprice)).append("\n");
    sb.append("    totalprice: ").append(toIndentedString(totalprice)).append("\n");
    sb.append("    tamount: ").append(toIndentedString(tamount)).append("\n");
    sb.append("    localtamount: ").append(toIndentedString(localtamount)).append("\n");
    sb.append("    localuamount: ").append(toIndentedString(localuamount)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    currrate: ").append(toIndentedString(currrate)).append("\n");
    sb.append("    refcurrrate: ").append(toIndentedString(refcurrrate)).append("\n");
    sb.append("    localothercostsratio: ").append(toIndentedString(localothercostsratio)).append("\n");
    sb.append("    validtodatedate: ").append(toIndentedString(validtodatedate)).append("\n");
    sb.append("    supplydatedate: ").append(toIndentedString(supplydatedate)).append("\n");
    sb.append("    supplyconditions: ").append(toIndentedString(supplyconditions)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitquantity: ").append(toIndentedString(unitquantity)).append("\n");
    sb.append("    qunit: ").append(toIndentedString(qunit)).append("\n");
    sb.append("    unitrate: ").append(toIndentedString(unitrate)).append("\n");
    sb.append("    iswinner: ").append(toIndentedString(iswinner)).append("\n");
    sb.append("    issueddemand2Id: ").append(toIndentedString(issueddemand2Id)).append("\n");
    sb.append("    demandingstatus: ").append(toIndentedString(demandingstatus)).append("\n");
    sb.append("    refcurrencyId: ").append(toIndentedString(refcurrencyId)).append("\n");
    sb.append("    localrefcurrencyId: ").append(toIndentedString(localrefcurrencyId)).append("\n");
    sb.append("    issueddemandDisplayname: ").append(toIndentedString(issueddemandDisplayname)).append("\n");
    sb.append("    demandfailurereasonId: ").append(toIndentedString(demandfailurereasonId)).append("\n");
    sb.append("    demandfailurecomment: ").append(toIndentedString(demandfailurecomment)).append("\n");
    sb.append("    storecardId: ").append(toIndentedString(storecardId)).append("\n");
    sb.append("    rowtype: ").append(toIndentedString(rowtype)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
