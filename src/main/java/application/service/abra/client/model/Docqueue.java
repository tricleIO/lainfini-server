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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Docqueue
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Docqueue   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("lastnumbers")
  private List<Docqueueperiod> lastnumbers = new ArrayList<Docqueueperiod>();

  @SerializedName("note")
  private String note = null;

  @SerializedName("documenttype")
  private String documenttype = null;

  @SerializedName("toaccount")
  private Boolean toaccount = null;

  @SerializedName("summaryaccounted")
  private Boolean summaryaccounted = null;

  @SerializedName("forceaccounting")
  private Boolean forceaccounting = null;

  @SerializedName("singleaccdocqueue_id")
  private Docqueue singleaccdocqueueId = null;

  @SerializedName("summaryaccdocqueue_id")
  private Docqueue summaryaccdocqueueId = null;

  @SerializedName("prefixvar")
  private Integer prefixvar = null;

  @SerializedName("firstopenperiod_id")
  private String firstopenperiodId = null;

  @SerializedName("lastopenperiod_id")
  private String lastopenperiodId = null;

  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("outofuse")
  private Boolean outofuse = null;

  @SerializedName("expensetype_id")
  private String expensetypeId = null;

  @SerializedName("incometype_id")
  private String incometypeId = null;

  @SerializedName("editextnumonrows")
  private Boolean editextnumonrows = null;

  @SerializedName("createreservations")
  private Boolean createreservations = null;

  @SerializedName("prefillcurrencyfromfirm")
  private Boolean prefillcurrencyfromfirm = null;

  @SerializedName("eetestablishment_id")
  private String eetestablishmentId = null;

  @SerializedName("otherdocelectronicpayment")
  private Boolean otherdocelectronicpayment = null;

  public Docqueue displayname(String displayname) {
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

  public Docqueue id(String id) {
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

  public Docqueue classid(String classid) {
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

  public Docqueue objversion(Integer objversion) {
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

  public Docqueue hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * skrytý [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "skrytý [persistentní položka]")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Docqueue code(String code) {
    this.code = code;
    return this;
  }

   /**
   * zkratka [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "zkratka [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Docqueue name(String name) {
    this.name = name;
    return this;
  }

   /**
   * název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Docqueue lastnumbers(List<Docqueueperiod> lastnumbers) {
    this.lastnumbers = lastnumbers;
    return this;
  }

  public Docqueue addLastnumbersItem(Docqueueperiod lastnumbersItem) {
    this.lastnumbers.add(lastnumbersItem);
    return this;
  }

   /**
   * Čísla; kolekce bo Řada dokladů - období [nepersistentní položka]
   * @return lastnumbers
  **/
  @ApiModelProperty(example = "null", value = "Čísla; kolekce bo Řada dokladů - období [nepersistentní položka]")
  public List<Docqueueperiod> getLastnumbers() {
    return lastnumbers;
  }

  public void setLastnumbers(List<Docqueueperiod> lastnumbers) {
    this.lastnumbers = lastnumbers;
  }

  public Docqueue note(String note) {
    this.note = note;
    return this;
  }

   /**
   * poznámka [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "poznámka [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Docqueue documenttype(String documenttype) {
    this.documenttype = documenttype;
    return this;
  }

   /**
   * typ dokladu [persistentní položka]
   * @return documenttype
  **/
  @ApiModelProperty(example = "null", value = "typ dokladu [persistentní položka]")
  public String getDocumenttype() {
    return documenttype;
  }

  public void setDocumenttype(String documenttype) {
    this.documenttype = documenttype;
  }

  public Docqueue toaccount(Boolean toaccount) {
    this.toaccount = toaccount;
    return this;
  }

   /**
   * Účtovat [persistentní položka]
   * @return toaccount
  **/
  @ApiModelProperty(example = "null", value = "Účtovat [persistentní položka]")
  public Boolean getToaccount() {
    return toaccount;
  }

  public void setToaccount(Boolean toaccount) {
    this.toaccount = toaccount;
  }

  public Docqueue summaryaccounted(Boolean summaryaccounted) {
    this.summaryaccounted = summaryaccounted;
    return this;
  }

   /**
   * souhrnně [persistentní položka]
   * @return summaryaccounted
  **/
  @ApiModelProperty(example = "null", value = "souhrnně [persistentní položka]")
  public Boolean getSummaryaccounted() {
    return summaryaccounted;
  }

  public void setSummaryaccounted(Boolean summaryaccounted) {
    this.summaryaccounted = summaryaccounted;
  }

  public Docqueue forceaccounting(Boolean forceaccounting) {
    this.forceaccounting = forceaccounting;
    return this;
  }

   /**
   * přeúčtovat vždy [persistentní položka]
   * @return forceaccounting
  **/
  @ApiModelProperty(example = "null", value = "přeúčtovat vždy [persistentní položka]")
  public Boolean getForceaccounting() {
    return forceaccounting;
  }

  public void setForceaccounting(Boolean forceaccounting) {
    this.forceaccounting = forceaccounting;
  }

  public Docqueue singleaccdocqueueId(Docqueue singleaccdocqueueId) {
    this.singleaccdocqueueId = singleaccdocqueueId;
    return this;
  }

   /**
   * Get singleaccdocqueueId
   * @return singleaccdocqueueId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Docqueue getSingleaccdocqueueId() {
    return singleaccdocqueueId;
  }

  public void setSingleaccdocqueueId(Docqueue singleaccdocqueueId) {
    this.singleaccdocqueueId = singleaccdocqueueId;
  }

  public Docqueue summaryaccdocqueueId(Docqueue summaryaccdocqueueId) {
    this.summaryaccdocqueueId = summaryaccdocqueueId;
    return this;
  }

   /**
   * Get summaryaccdocqueueId
   * @return summaryaccdocqueueId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Docqueue getSummaryaccdocqueueId() {
    return summaryaccdocqueueId;
  }

  public void setSummaryaccdocqueueId(Docqueue summaryaccdocqueueId) {
    this.summaryaccdocqueueId = summaryaccdocqueueId;
  }

  public Docqueue prefixvar(Integer prefixvar) {
    this.prefixvar = prefixvar;
    return this;
  }

   /**
   * prefix řady [persistentní položka]
   * @return prefixvar
  **/
  @ApiModelProperty(example = "null", value = "prefix řady [persistentní položka]")
  public Integer getPrefixvar() {
    return prefixvar;
  }

  public void setPrefixvar(Integer prefixvar) {
    this.prefixvar = prefixvar;
  }

  public Docqueue firstopenperiodId(String firstopenperiodId) {
    this.firstopenperiodId = firstopenperiodId;
    return this;
  }

   /**
   * první otevřené období; id objektu období [persistentní položka]
   * @return firstopenperiodId
  **/
  @ApiModelProperty(example = "null", value = "první otevřené období; id objektu období [persistentní položka]")
  public String getFirstopenperiodId() {
    return firstopenperiodId;
  }

  public void setFirstopenperiodId(String firstopenperiodId) {
    this.firstopenperiodId = firstopenperiodId;
  }

  public Docqueue lastopenperiodId(String lastopenperiodId) {
    this.lastopenperiodId = lastopenperiodId;
    return this;
  }

   /**
   * poslední otevřené období; id objektu období [persistentní položka]
   * @return lastopenperiodId
  **/
  @ApiModelProperty(example = "null", value = "poslední otevřené období; id objektu období [persistentní položka]")
  public String getLastopenperiodId() {
    return lastopenperiodId;
  }

  public void setLastopenperiodId(String lastopenperiodId) {
    this.lastopenperiodId = lastopenperiodId;
  }

  public Docqueue accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Účet; id objektu Účet účetního rozvrhu [persistentní položka]
   * @return accountId
  **/
  @ApiModelProperty(example = "null", value = "Účet; id objektu Účet účetního rozvrhu [persistentní položka]")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Docqueue outofuse(Boolean outofuse) {
    this.outofuse = outofuse;
    return this;
  }

   /**
   * nepoužívaná řada [persistentní položka]
   * @return outofuse
  **/
  @ApiModelProperty(example = "null", value = "nepoužívaná řada [persistentní položka]")
  public Boolean getOutofuse() {
    return outofuse;
  }

  public void setOutofuse(Boolean outofuse) {
    this.outofuse = outofuse;
  }

  public Docqueue expensetypeId(String expensetypeId) {
    this.expensetypeId = expensetypeId;
    return this;
  }

   /**
   * typ výdaje; id objektu typ výdaje [persistentní položka]
   * @return expensetypeId
  **/
  @ApiModelProperty(example = "null", value = "typ výdaje; id objektu typ výdaje [persistentní položka]")
  public String getExpensetypeId() {
    return expensetypeId;
  }

  public void setExpensetypeId(String expensetypeId) {
    this.expensetypeId = expensetypeId;
  }

  public Docqueue incometypeId(String incometypeId) {
    this.incometypeId = incometypeId;
    return this;
  }

   /**
   * typ příjmu; id objektu typ příjmu [persistentní položka]
   * @return incometypeId
  **/
  @ApiModelProperty(example = "null", value = "typ příjmu; id objektu typ příjmu [persistentní položka]")
  public String getIncometypeId() {
    return incometypeId;
  }

  public void setIncometypeId(String incometypeId) {
    this.incometypeId = incometypeId;
  }

  public Docqueue editextnumonrows(Boolean editextnumonrows) {
    this.editextnumonrows = editextnumonrows;
    return this;
  }

   /**
   * zadávat externí číslo na řádcích [persistentní položka]
   * @return editextnumonrows
  **/
  @ApiModelProperty(example = "null", value = "zadávat externí číslo na řádcích [persistentní položka]")
  public Boolean getEditextnumonrows() {
    return editextnumonrows;
  }

  public void setEditextnumonrows(Boolean editextnumonrows) {
    this.editextnumonrows = editextnumonrows;
  }

  public Docqueue createreservations(Boolean createreservations) {
    this.createreservations = createreservations;
    return this;
  }

   /**
   * vytvořit rezervace [persistentní položka]
   * @return createreservations
  **/
  @ApiModelProperty(example = "null", value = "vytvořit rezervace [persistentní položka]")
  public Boolean getCreatereservations() {
    return createreservations;
  }

  public void setCreatereservations(Boolean createreservations) {
    this.createreservations = createreservations;
  }

  public Docqueue prefillcurrencyfromfirm(Boolean prefillcurrencyfromfirm) {
    this.prefillcurrencyfromfirm = prefillcurrencyfromfirm;
    return this;
  }

   /**
   * předvyplnit měnu dle firmy [persistentní položka]
   * @return prefillcurrencyfromfirm
  **/
  @ApiModelProperty(example = "null", value = "předvyplnit měnu dle firmy [persistentní položka]")
  public Boolean getPrefillcurrencyfromfirm() {
    return prefillcurrencyfromfirm;
  }

  public void setPrefillcurrencyfromfirm(Boolean prefillcurrencyfromfirm) {
    this.prefillcurrencyfromfirm = prefillcurrencyfromfirm;
  }

  public Docqueue eetestablishmentId(String eetestablishmentId) {
    this.eetestablishmentId = eetestablishmentId;
    return this;
  }

   /**
   * provozovna eet; id objektu provozovna eet [persistentní položka]
   * @return eetestablishmentId
  **/
  @ApiModelProperty(example = "null", value = "provozovna eet; id objektu provozovna eet [persistentní položka]")
  public String getEetestablishmentId() {
    return eetestablishmentId;
  }

  public void setEetestablishmentId(String eetestablishmentId) {
    this.eetestablishmentId = eetestablishmentId;
  }

  public Docqueue otherdocelectronicpayment(Boolean otherdocelectronicpayment) {
    this.otherdocelectronicpayment = otherdocelectronicpayment;
    return this;
  }

   /**
   * pro evidenci elektronické platby [persistentní položka]
   * @return otherdocelectronicpayment
  **/
  @ApiModelProperty(example = "null", value = "pro evidenci elektronické platby [persistentní položka]")
  public Boolean getOtherdocelectronicpayment() {
    return otherdocelectronicpayment;
  }

  public void setOtherdocelectronicpayment(Boolean otherdocelectronicpayment) {
    this.otherdocelectronicpayment = otherdocelectronicpayment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Docqueue docqueue = (Docqueue) o;
    return Objects.equals(this.displayname, docqueue.displayname) &&
        Objects.equals(this.id, docqueue.id) &&
        Objects.equals(this.classid, docqueue.classid) &&
        Objects.equals(this.objversion, docqueue.objversion) &&
        Objects.equals(this.hidden, docqueue.hidden) &&
        Objects.equals(this.code, docqueue.code) &&
        Objects.equals(this.name, docqueue.name) &&
        Objects.equals(this.lastnumbers, docqueue.lastnumbers) &&
        Objects.equals(this.note, docqueue.note) &&
        Objects.equals(this.documenttype, docqueue.documenttype) &&
        Objects.equals(this.toaccount, docqueue.toaccount) &&
        Objects.equals(this.summaryaccounted, docqueue.summaryaccounted) &&
        Objects.equals(this.forceaccounting, docqueue.forceaccounting) &&
        Objects.equals(this.singleaccdocqueueId, docqueue.singleaccdocqueueId) &&
        Objects.equals(this.summaryaccdocqueueId, docqueue.summaryaccdocqueueId) &&
        Objects.equals(this.prefixvar, docqueue.prefixvar) &&
        Objects.equals(this.firstopenperiodId, docqueue.firstopenperiodId) &&
        Objects.equals(this.lastopenperiodId, docqueue.lastopenperiodId) &&
        Objects.equals(this.accountId, docqueue.accountId) &&
        Objects.equals(this.outofuse, docqueue.outofuse) &&
        Objects.equals(this.expensetypeId, docqueue.expensetypeId) &&
        Objects.equals(this.incometypeId, docqueue.incometypeId) &&
        Objects.equals(this.editextnumonrows, docqueue.editextnumonrows) &&
        Objects.equals(this.createreservations, docqueue.createreservations) &&
        Objects.equals(this.prefillcurrencyfromfirm, docqueue.prefillcurrencyfromfirm) &&
        Objects.equals(this.eetestablishmentId, docqueue.eetestablishmentId) &&
        Objects.equals(this.otherdocelectronicpayment, docqueue.otherdocelectronicpayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, code, name, lastnumbers, note, documenttype, toaccount, summaryaccounted, forceaccounting, singleaccdocqueueId, summaryaccdocqueueId, prefixvar, firstopenperiodId, lastopenperiodId, accountId, outofuse, expensetypeId, incometypeId, editextnumonrows, createreservations, prefillcurrencyfromfirm, eetestablishmentId, otherdocelectronicpayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Docqueue {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastnumbers: ").append(toIndentedString(lastnumbers)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    documenttype: ").append(toIndentedString(documenttype)).append("\n");
    sb.append("    toaccount: ").append(toIndentedString(toaccount)).append("\n");
    sb.append("    summaryaccounted: ").append(toIndentedString(summaryaccounted)).append("\n");
    sb.append("    forceaccounting: ").append(toIndentedString(forceaccounting)).append("\n");
    sb.append("    singleaccdocqueueId: ").append(toIndentedString(singleaccdocqueueId)).append("\n");
    sb.append("    summaryaccdocqueueId: ").append(toIndentedString(summaryaccdocqueueId)).append("\n");
    sb.append("    prefixvar: ").append(toIndentedString(prefixvar)).append("\n");
    sb.append("    firstopenperiodId: ").append(toIndentedString(firstopenperiodId)).append("\n");
    sb.append("    lastopenperiodId: ").append(toIndentedString(lastopenperiodId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    outofuse: ").append(toIndentedString(outofuse)).append("\n");
    sb.append("    expensetypeId: ").append(toIndentedString(expensetypeId)).append("\n");
    sb.append("    incometypeId: ").append(toIndentedString(incometypeId)).append("\n");
    sb.append("    editextnumonrows: ").append(toIndentedString(editextnumonrows)).append("\n");
    sb.append("    createreservations: ").append(toIndentedString(createreservations)).append("\n");
    sb.append("    prefillcurrencyfromfirm: ").append(toIndentedString(prefillcurrencyfromfirm)).append("\n");
    sb.append("    eetestablishmentId: ").append(toIndentedString(eetestablishmentId)).append("\n");
    sb.append("    otherdocelectronicpayment: ").append(toIndentedString(otherdocelectronicpayment)).append("\n");
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

