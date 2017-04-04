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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Busproject
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Busproject   {
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

  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("closed")
  private Boolean closed = null;

  @SerializedName("date$date")
  private DateTime datedate = null;

  @SerializedName("displayparent")
  private String displayparent = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("firm_id")
  private String firmId = null;

  @SerializedName("prefixcode")
  private String prefixcode = null;

  @SerializedName("bodycode")
  private String bodycode = null;

  @SerializedName("suffixcode")
  private String suffixcode = null;

  @SerializedName("plannedenddate$date")
  private DateTime plannedenddatedate = null;

  @SerializedName("approved")
  private Boolean approved = null;

  @SerializedName("extendedcontrol")
  private Boolean extendedcontrol = null;

  @SerializedName("mastersolverrole_id")
  private String mastersolverroleId = null;

  @SerializedName("processstate")
  private Integer processstate = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("plannedcostsother")
  private Double plannedcostsother = null;

  @SerializedName("plannedrevenuesother")
  private Double plannedrevenuesother = null;

  @SerializedName("plannedcoststotal")
  private Double plannedcoststotal = null;

  @SerializedName("plannedrevenuestotal")
  private Double plannedrevenuestotal = null;

  @SerializedName("issuedoffer_id")
  private String issuedofferId = null;

  @SerializedName("invoicingtype")
  private Integer invoicingtype = null;

  @SerializedName("fixedamount")
  private Double fixedamount = null;

  @SerializedName("checkactivityvssources")
  private Integer checkactivityvssources = null;

  @SerializedName("finalizationstate")
  private Double finalizationstate = null;

  @SerializedName("plannedcostsalltotal")
  private Double plannedcostsalltotal = null;

  @SerializedName("plannedrevenuesalltotal")
  private Double plannedrevenuesalltotal = null;

  @SerializedName("plannedprofittotal")
  private Double plannedprofittotal = null;

  @SerializedName("plannedprofit")
  private Double plannedprofit = null;

  @SerializedName("processstateastext")
  private String processstateastext = null;

  @SerializedName("invoicingtypeastext")
  private String invoicingtypeastext = null;

  @SerializedName("checkactivityvssourcesastext")
  private String checkactivityvssourcesastext = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("closingdate$date")
  private DateTime closingdatedate = null;

  @SerializedName("plannedcostssubtree")
  private Double plannedcostssubtree = null;

  @SerializedName("plannedrevenuessubtree")
  private Double plannedrevenuessubtree = null;

  @SerializedName("finalizationstatesub")
  private Double finalizationstatesub = null;

  @SerializedName("links")
  private List<Busprojectlink> links = new ArrayList<Busprojectlink>();

  @SerializedName("checkpoints")
  private List<Busprojectcheckpoint> checkpoints = new ArrayList<Busprojectcheckpoint>();

  @SerializedName("sources")
  private List<Busprojectsource> sources = new ArrayList<Busprojectsource>();

  public Busproject displayname(String displayname) {
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

  public Busproject id(String id) {
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

  public Busproject classid(String classid) {
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

  public Busproject objversion(Integer objversion) {
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

  public Busproject hidden(Boolean hidden) {
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

  public Busproject name(String name) {
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

  public Busproject code(String code) {
    this.code = code;
    return this;
  }

   /**
   * kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Busproject note(String note) {
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

  public Busproject comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * poznámka
   * @return comment
  **/
  @ApiModelProperty(example = "null", value = "poznámka")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Busproject closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

   /**
   * uzavřeno [persistentní položka]
   * @return closed
  **/
  @ApiModelProperty(example = "null", value = "uzavřeno [persistentní položka]")
  public Boolean getClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public Busproject datedate(DateTime datedate) {
    this.datedate = datedate;
    return this;
  }

   /**
   * datum zahájení [persistentní položka]
   * @return datedate
  **/
  @ApiModelProperty(example = "null", value = "datum zahájení [persistentní položka]")
  public DateTime getDatedate() {
    return datedate;
  }

  public void setDatedate(DateTime datedate) {
    this.datedate = datedate;
  }

  public Busproject displayparent(String displayparent) {
    this.displayparent = displayparent;
    return this;
  }

   /**
   * nadřízený(zobr.)
   * @return displayparent
  **/
  @ApiModelProperty(example = "null", value = "nadřízený(zobr.)")
  public String getDisplayparent() {
    return displayparent;
  }

  public void setDisplayparent(String displayparent) {
    this.displayparent = displayparent;
  }

  public Busproject divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }

   /**
   * středisko; id objektu středisko [persistentní položka]
   * @return divisionId
  **/
  @ApiModelProperty(example = "null", value = "středisko; id objektu středisko [persistentní položka]")
  public String getDivisionId() {
    return divisionId;
  }

  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  public Busproject firmId(String firmId) {
    this.firmId = firmId;
    return this;
  }

   /**
   * firma; id objektu firma [persistentní položka]
   * @return firmId
  **/
  @ApiModelProperty(example = "null", value = "firma; id objektu firma [persistentní položka]")
  public String getFirmId() {
    return firmId;
  }

  public void setFirmId(String firmId) {
    this.firmId = firmId;
  }

  public Busproject prefixcode(String prefixcode) {
    this.prefixcode = prefixcode;
    return this;
  }

   /**
   * prefix kódu
   * @return prefixcode
  **/
  @ApiModelProperty(example = "null", value = "prefix kódu")
  public String getPrefixcode() {
    return prefixcode;
  }

  public void setPrefixcode(String prefixcode) {
    this.prefixcode = prefixcode;
  }

  public Busproject bodycode(String bodycode) {
    this.bodycode = bodycode;
    return this;
  }

   /**
   * Číslo kódu
   * @return bodycode
  **/
  @ApiModelProperty(example = "null", value = "Číslo kódu")
  public String getBodycode() {
    return bodycode;
  }

  public void setBodycode(String bodycode) {
    this.bodycode = bodycode;
  }

  public Busproject suffixcode(String suffixcode) {
    this.suffixcode = suffixcode;
    return this;
  }

   /**
   * sufix kódu
   * @return suffixcode
  **/
  @ApiModelProperty(example = "null", value = "sufix kódu")
  public String getSuffixcode() {
    return suffixcode;
  }

  public void setSuffixcode(String suffixcode) {
    this.suffixcode = suffixcode;
  }

  public Busproject plannedenddatedate(DateTime plannedenddatedate) {
    this.plannedenddatedate = plannedenddatedate;
    return this;
  }

   /**
   * pl.datum ukončení [persistentní položka]
   * @return plannedenddatedate
  **/
  @ApiModelProperty(example = "null", value = "pl.datum ukončení [persistentní položka]")
  public DateTime getPlannedenddatedate() {
    return plannedenddatedate;
  }

  public void setPlannedenddatedate(DateTime plannedenddatedate) {
    this.plannedenddatedate = plannedenddatedate;
  }

  public Busproject approved(Boolean approved) {
    this.approved = approved;
    return this;
  }

   /**
   * schváleno [persistentní položka]
   * @return approved
  **/
  @ApiModelProperty(example = "null", value = "schváleno [persistentní položka]")
  public Boolean getApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  public Busproject extendedcontrol(Boolean extendedcontrol) {
    this.extendedcontrol = extendedcontrol;
    return this;
  }

   /**
   * rozšířené řízení [persistentní položka]
   * @return extendedcontrol
  **/
  @ApiModelProperty(example = "null", value = "rozšířené řízení [persistentní položka]")
  public Boolean getExtendedcontrol() {
    return extendedcontrol;
  }

  public void setExtendedcontrol(Boolean extendedcontrol) {
    this.extendedcontrol = extendedcontrol;
  }

  public Busproject mastersolverroleId(String mastersolverroleId) {
    this.mastersolverroleId = mastersolverroleId;
    return this;
  }

   /**
   * vedoucí; id objektu role [persistentní položka]
   * @return mastersolverroleId
  **/
  @ApiModelProperty(example = "null", value = "vedoucí; id objektu role [persistentní položka]")
  public String getMastersolverroleId() {
    return mastersolverroleId;
  }

  public void setMastersolverroleId(String mastersolverroleId) {
    this.mastersolverroleId = mastersolverroleId;
  }

  public Busproject processstate(Integer processstate) {
    this.processstate = processstate;
    return this;
  }

   /**
   * stav [persistentní položka]
   * @return processstate
  **/
  @ApiModelProperty(example = "null", value = "stav [persistentní položka]")
  public Integer getProcessstate() {
    return processstate;
  }

  public void setProcessstate(Integer processstate) {
    this.processstate = processstate;
  }

  public Busproject priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * priorita [persistentní položka]
   * @return priority
  **/
  @ApiModelProperty(example = "null", value = "priorita [persistentní položka]")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Busproject plannedcostsother(Double plannedcostsother) {
    this.plannedcostsother = plannedcostsother;
    return this;
  }

   /**
   * ostatní pl.náklady [persistentní položka]
   * @return plannedcostsother
  **/
  @ApiModelProperty(example = "null", value = "ostatní pl.náklady [persistentní položka]")
  public Double getPlannedcostsother() {
    return plannedcostsother;
  }

  public void setPlannedcostsother(Double plannedcostsother) {
    this.plannedcostsother = plannedcostsother;
  }

  public Busproject plannedrevenuesother(Double plannedrevenuesother) {
    this.plannedrevenuesother = plannedrevenuesother;
    return this;
  }

   /**
   * ostatní pl.výnosy [persistentní položka]
   * @return plannedrevenuesother
  **/
  @ApiModelProperty(example = "null", value = "ostatní pl.výnosy [persistentní položka]")
  public Double getPlannedrevenuesother() {
    return plannedrevenuesother;
  }

  public void setPlannedrevenuesother(Double plannedrevenuesother) {
    this.plannedrevenuesother = plannedrevenuesother;
  }

  public Busproject plannedcoststotal(Double plannedcoststotal) {
    this.plannedcoststotal = plannedcoststotal;
    return this;
  }

   /**
   * pl.náklady [persistentní položka]
   * @return plannedcoststotal
  **/
  @ApiModelProperty(example = "null", value = "pl.náklady [persistentní položka]")
  public Double getPlannedcoststotal() {
    return plannedcoststotal;
  }

  public void setPlannedcoststotal(Double plannedcoststotal) {
    this.plannedcoststotal = plannedcoststotal;
  }

  public Busproject plannedrevenuestotal(Double plannedrevenuestotal) {
    this.plannedrevenuestotal = plannedrevenuestotal;
    return this;
  }

   /**
   * pl.výnosy [persistentní položka]
   * @return plannedrevenuestotal
  **/
  @ApiModelProperty(example = "null", value = "pl.výnosy [persistentní položka]")
  public Double getPlannedrevenuestotal() {
    return plannedrevenuestotal;
  }

  public void setPlannedrevenuestotal(Double plannedrevenuestotal) {
    this.plannedrevenuestotal = plannedrevenuestotal;
  }

  public Busproject issuedofferId(String issuedofferId) {
    this.issuedofferId = issuedofferId;
    return this;
  }

   /**
   * nabídka vydaná; id objektu nabídka vydaná [persistentní položka]
   * @return issuedofferId
  **/
  @ApiModelProperty(example = "null", value = "nabídka vydaná; id objektu nabídka vydaná [persistentní položka]")
  public String getIssuedofferId() {
    return issuedofferId;
  }

  public void setIssuedofferId(String issuedofferId) {
    this.issuedofferId = issuedofferId;
  }

  public Busproject invoicingtype(Integer invoicingtype) {
    this.invoicingtype = invoicingtype;
    return this;
  }

   /**
   * způsob fakturace [persistentní položka]
   * @return invoicingtype
  **/
  @ApiModelProperty(example = "null", value = "způsob fakturace [persistentní položka]")
  public Integer getInvoicingtype() {
    return invoicingtype;
  }

  public void setInvoicingtype(Integer invoicingtype) {
    this.invoicingtype = invoicingtype;
  }

  public Busproject fixedamount(Double fixedamount) {
    this.fixedamount = fixedamount;
    return this;
  }

   /**
   * fakturovat [persistentní položka]
   * @return fixedamount
  **/
  @ApiModelProperty(example = "null", value = "fakturovat [persistentní položka]")
  public Double getFixedamount() {
    return fixedamount;
  }

  public void setFixedamount(Double fixedamount) {
    this.fixedamount = fixedamount;
  }

  public Busproject checkactivityvssources(Integer checkactivityvssources) {
    this.checkactivityvssources = checkactivityvssources;
    return this;
  }

   /**
   * kontrola role [persistentní položka]
   * @return checkactivityvssources
  **/
  @ApiModelProperty(example = "null", value = "kontrola role [persistentní položka]")
  public Integer getCheckactivityvssources() {
    return checkactivityvssources;
  }

  public void setCheckactivityvssources(Integer checkactivityvssources) {
    this.checkactivityvssources = checkactivityvssources;
  }

  public Busproject finalizationstate(Double finalizationstate) {
    this.finalizationstate = finalizationstate;
    return this;
  }

   /**
   * procento dokončení [persistentní položka]
   * @return finalizationstate
  **/
  @ApiModelProperty(example = "null", value = "procento dokončení [persistentní položka]")
  public Double getFinalizationstate() {
    return finalizationstate;
  }

  public void setFinalizationstate(Double finalizationstate) {
    this.finalizationstate = finalizationstate;
  }

  public Busproject plannedcostsalltotal(Double plannedcostsalltotal) {
    this.plannedcostsalltotal = plannedcostsalltotal;
    return this;
  }

   /**
   * celk.plán.nákl.
   * @return plannedcostsalltotal
  **/
  @ApiModelProperty(example = "null", value = "celk.plán.nákl.")
  public Double getPlannedcostsalltotal() {
    return plannedcostsalltotal;
  }

  public void setPlannedcostsalltotal(Double plannedcostsalltotal) {
    this.plannedcostsalltotal = plannedcostsalltotal;
  }

  public Busproject plannedrevenuesalltotal(Double plannedrevenuesalltotal) {
    this.plannedrevenuesalltotal = plannedrevenuesalltotal;
    return this;
  }

   /**
   * celk.plán.výnosy
   * @return plannedrevenuesalltotal
  **/
  @ApiModelProperty(example = "null", value = "celk.plán.výnosy")
  public Double getPlannedrevenuesalltotal() {
    return plannedrevenuesalltotal;
  }

  public void setPlannedrevenuesalltotal(Double plannedrevenuesalltotal) {
    this.plannedrevenuesalltotal = plannedrevenuesalltotal;
  }

  public Busproject plannedprofittotal(Double plannedprofittotal) {
    this.plannedprofittotal = plannedprofittotal;
    return this;
  }

   /**
   * plánovaný zisk
   * @return plannedprofittotal
  **/
  @ApiModelProperty(example = "null", value = "plánovaný zisk")
  public Double getPlannedprofittotal() {
    return plannedprofittotal;
  }

  public void setPlannedprofittotal(Double plannedprofittotal) {
    this.plannedprofittotal = plannedprofittotal;
  }

  public Busproject plannedprofit(Double plannedprofit) {
    this.plannedprofit = plannedprofit;
    return this;
  }

   /**
   * plánovaný zisk vč.podřízených
   * @return plannedprofit
  **/
  @ApiModelProperty(example = "null", value = "plánovaný zisk vč.podřízených")
  public Double getPlannedprofit() {
    return plannedprofit;
  }

  public void setPlannedprofit(Double plannedprofit) {
    this.plannedprofit = plannedprofit;
  }

  public Busproject processstateastext(String processstateastext) {
    this.processstateastext = processstateastext;
    return this;
  }

   /**
   * stav
   * @return processstateastext
  **/
  @ApiModelProperty(example = "null", value = "stav")
  public String getProcessstateastext() {
    return processstateastext;
  }

  public void setProcessstateastext(String processstateastext) {
    this.processstateastext = processstateastext;
  }

  public Busproject invoicingtypeastext(String invoicingtypeastext) {
    this.invoicingtypeastext = invoicingtypeastext;
    return this;
  }

   /**
   * způsob fakturace
   * @return invoicingtypeastext
  **/
  @ApiModelProperty(example = "null", value = "způsob fakturace")
  public String getInvoicingtypeastext() {
    return invoicingtypeastext;
  }

  public void setInvoicingtypeastext(String invoicingtypeastext) {
    this.invoicingtypeastext = invoicingtypeastext;
  }

  public Busproject checkactivityvssourcesastext(String checkactivityvssourcesastext) {
    this.checkactivityvssourcesastext = checkactivityvssourcesastext;
    return this;
  }

   /**
   * kontrola role
   * @return checkactivityvssourcesastext
  **/
  @ApiModelProperty(example = "null", value = "kontrola role")
  public String getCheckactivityvssourcesastext() {
    return checkactivityvssourcesastext;
  }

  public void setCheckactivityvssourcesastext(String checkactivityvssourcesastext) {
    this.checkactivityvssourcesastext = checkactivityvssourcesastext;
  }

  public Busproject parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * nadřízený(zobr.); id objektu projekt [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "nadřízený(zobr.); id objektu projekt [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Busproject closingdatedate(DateTime closingdatedate) {
    this.closingdatedate = closingdatedate;
    return this;
  }

   /**
   * datum uzavření [persistentní položka]
   * @return closingdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum uzavření [persistentní položka]")
  public DateTime getClosingdatedate() {
    return closingdatedate;
  }

  public void setClosingdatedate(DateTime closingdatedate) {
    this.closingdatedate = closingdatedate;
  }

  public Busproject plannedcostssubtree(Double plannedcostssubtree) {
    this.plannedcostssubtree = plannedcostssubtree;
    return this;
  }

   /**
   * plán.nákl.za podřízené projekty
   * @return plannedcostssubtree
  **/
  @ApiModelProperty(example = "null", value = "plán.nákl.za podřízené projekty")
  public Double getPlannedcostssubtree() {
    return plannedcostssubtree;
  }

  public void setPlannedcostssubtree(Double plannedcostssubtree) {
    this.plannedcostssubtree = plannedcostssubtree;
  }

  public Busproject plannedrevenuessubtree(Double plannedrevenuessubtree) {
    this.plannedrevenuessubtree = plannedrevenuessubtree;
    return this;
  }

   /**
   * plán.výnosy za podřízené projekty
   * @return plannedrevenuessubtree
  **/
  @ApiModelProperty(example = "null", value = "plán.výnosy za podřízené projekty")
  public Double getPlannedrevenuessubtree() {
    return plannedrevenuessubtree;
  }

  public void setPlannedrevenuessubtree(Double plannedrevenuessubtree) {
    this.plannedrevenuessubtree = plannedrevenuessubtree;
  }

  public Busproject finalizationstatesub(Double finalizationstatesub) {
    this.finalizationstatesub = finalizationstatesub;
    return this;
  }

   /**
   * proc.dokončení podřízených projektů
   * @return finalizationstatesub
  **/
  @ApiModelProperty(example = "null", value = "proc.dokončení podřízených projektů")
  public Double getFinalizationstatesub() {
    return finalizationstatesub;
  }

  public void setFinalizationstatesub(Double finalizationstatesub) {
    this.finalizationstatesub = finalizationstatesub;
  }

  public Busproject links(List<Busprojectlink> links) {
    this.links = links;
    return this;
  }

  public Busproject addLinksItem(Busprojectlink linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * návaznosti na před.projekty; kolekce bo návaznosti projektu [nepersistentní položka]
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "návaznosti na před.projekty; kolekce bo návaznosti projektu [nepersistentní položka]")
  public List<Busprojectlink> getLinks() {
    return links;
  }

  public void setLinks(List<Busprojectlink> links) {
    this.links = links;
  }

  public Busproject checkpoints(List<Busprojectcheckpoint> checkpoints) {
    this.checkpoints = checkpoints;
    return this;
  }

  public Busproject addCheckpointsItem(Busprojectcheckpoint checkpointsItem) {
    this.checkpoints.add(checkpointsItem);
    return this;
  }

   /**
   * kontrolní body; kolekce bo projekt - kontrolní bod [nepersistentní položka]
   * @return checkpoints
  **/
  @ApiModelProperty(example = "null", value = "kontrolní body; kolekce bo projekt - kontrolní bod [nepersistentní položka]")
  public List<Busprojectcheckpoint> getCheckpoints() {
    return checkpoints;
  }

  public void setCheckpoints(List<Busprojectcheckpoint> checkpoints) {
    this.checkpoints = checkpoints;
  }

  public Busproject sources(List<Busprojectsource> sources) {
    this.sources = sources;
    return this;
  }

  public Busproject addSourcesItem(Busprojectsource sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * zdroje; kolekce bo projekt - zdroj [nepersistentní položka]
   * @return sources
  **/
  @ApiModelProperty(example = "null", value = "zdroje; kolekce bo projekt - zdroj [nepersistentní položka]")
  public List<Busprojectsource> getSources() {
    return sources;
  }

  public void setSources(List<Busprojectsource> sources) {
    this.sources = sources;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Busproject busproject = (Busproject) o;
    return Objects.equals(this.displayname, busproject.displayname) &&
        Objects.equals(this.id, busproject.id) &&
        Objects.equals(this.classid, busproject.classid) &&
        Objects.equals(this.objversion, busproject.objversion) &&
        Objects.equals(this.hidden, busproject.hidden) &&
        Objects.equals(this.name, busproject.name) &&
        Objects.equals(this.code, busproject.code) &&
        Objects.equals(this.note, busproject.note) &&
        Objects.equals(this.comment, busproject.comment) &&
        Objects.equals(this.closed, busproject.closed) &&
        Objects.equals(this.datedate, busproject.datedate) &&
        Objects.equals(this.displayparent, busproject.displayparent) &&
        Objects.equals(this.divisionId, busproject.divisionId) &&
        Objects.equals(this.firmId, busproject.firmId) &&
        Objects.equals(this.prefixcode, busproject.prefixcode) &&
        Objects.equals(this.bodycode, busproject.bodycode) &&
        Objects.equals(this.suffixcode, busproject.suffixcode) &&
        Objects.equals(this.plannedenddatedate, busproject.plannedenddatedate) &&
        Objects.equals(this.approved, busproject.approved) &&
        Objects.equals(this.extendedcontrol, busproject.extendedcontrol) &&
        Objects.equals(this.mastersolverroleId, busproject.mastersolverroleId) &&
        Objects.equals(this.processstate, busproject.processstate) &&
        Objects.equals(this.priority, busproject.priority) &&
        Objects.equals(this.plannedcostsother, busproject.plannedcostsother) &&
        Objects.equals(this.plannedrevenuesother, busproject.plannedrevenuesother) &&
        Objects.equals(this.plannedcoststotal, busproject.plannedcoststotal) &&
        Objects.equals(this.plannedrevenuestotal, busproject.plannedrevenuestotal) &&
        Objects.equals(this.issuedofferId, busproject.issuedofferId) &&
        Objects.equals(this.invoicingtype, busproject.invoicingtype) &&
        Objects.equals(this.fixedamount, busproject.fixedamount) &&
        Objects.equals(this.checkactivityvssources, busproject.checkactivityvssources) &&
        Objects.equals(this.finalizationstate, busproject.finalizationstate) &&
        Objects.equals(this.plannedcostsalltotal, busproject.plannedcostsalltotal) &&
        Objects.equals(this.plannedrevenuesalltotal, busproject.plannedrevenuesalltotal) &&
        Objects.equals(this.plannedprofittotal, busproject.plannedprofittotal) &&
        Objects.equals(this.plannedprofit, busproject.plannedprofit) &&
        Objects.equals(this.processstateastext, busproject.processstateastext) &&
        Objects.equals(this.invoicingtypeastext, busproject.invoicingtypeastext) &&
        Objects.equals(this.checkactivityvssourcesastext, busproject.checkactivityvssourcesastext) &&
        Objects.equals(this.parentId, busproject.parentId) &&
        Objects.equals(this.closingdatedate, busproject.closingdatedate) &&
        Objects.equals(this.plannedcostssubtree, busproject.plannedcostssubtree) &&
        Objects.equals(this.plannedrevenuessubtree, busproject.plannedrevenuessubtree) &&
        Objects.equals(this.finalizationstatesub, busproject.finalizationstatesub) &&
        Objects.equals(this.links, busproject.links) &&
        Objects.equals(this.checkpoints, busproject.checkpoints) &&
        Objects.equals(this.sources, busproject.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, name, code, note, comment, closed, datedate, displayparent, divisionId, firmId, prefixcode, bodycode, suffixcode, plannedenddatedate, approved, extendedcontrol, mastersolverroleId, processstate, priority, plannedcostsother, plannedrevenuesother, plannedcoststotal, plannedrevenuestotal, issuedofferId, invoicingtype, fixedamount, checkactivityvssources, finalizationstate, plannedcostsalltotal, plannedrevenuesalltotal, plannedprofittotal, plannedprofit, processstateastext, invoicingtypeastext, checkactivityvssourcesastext, parentId, closingdatedate, plannedcostssubtree, plannedrevenuessubtree, finalizationstatesub, links, checkpoints, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Busproject {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    datedate: ").append(toIndentedString(datedate)).append("\n");
    sb.append("    displayparent: ").append(toIndentedString(displayparent)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    firmId: ").append(toIndentedString(firmId)).append("\n");
    sb.append("    prefixcode: ").append(toIndentedString(prefixcode)).append("\n");
    sb.append("    bodycode: ").append(toIndentedString(bodycode)).append("\n");
    sb.append("    suffixcode: ").append(toIndentedString(suffixcode)).append("\n");
    sb.append("    plannedenddatedate: ").append(toIndentedString(plannedenddatedate)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    extendedcontrol: ").append(toIndentedString(extendedcontrol)).append("\n");
    sb.append("    mastersolverroleId: ").append(toIndentedString(mastersolverroleId)).append("\n");
    sb.append("    processstate: ").append(toIndentedString(processstate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    plannedcostsother: ").append(toIndentedString(plannedcostsother)).append("\n");
    sb.append("    plannedrevenuesother: ").append(toIndentedString(plannedrevenuesother)).append("\n");
    sb.append("    plannedcoststotal: ").append(toIndentedString(plannedcoststotal)).append("\n");
    sb.append("    plannedrevenuestotal: ").append(toIndentedString(plannedrevenuestotal)).append("\n");
    sb.append("    issuedofferId: ").append(toIndentedString(issuedofferId)).append("\n");
    sb.append("    invoicingtype: ").append(toIndentedString(invoicingtype)).append("\n");
    sb.append("    fixedamount: ").append(toIndentedString(fixedamount)).append("\n");
    sb.append("    checkactivityvssources: ").append(toIndentedString(checkactivityvssources)).append("\n");
    sb.append("    finalizationstate: ").append(toIndentedString(finalizationstate)).append("\n");
    sb.append("    plannedcostsalltotal: ").append(toIndentedString(plannedcostsalltotal)).append("\n");
    sb.append("    plannedrevenuesalltotal: ").append(toIndentedString(plannedrevenuesalltotal)).append("\n");
    sb.append("    plannedprofittotal: ").append(toIndentedString(plannedprofittotal)).append("\n");
    sb.append("    plannedprofit: ").append(toIndentedString(plannedprofit)).append("\n");
    sb.append("    processstateastext: ").append(toIndentedString(processstateastext)).append("\n");
    sb.append("    invoicingtypeastext: ").append(toIndentedString(invoicingtypeastext)).append("\n");
    sb.append("    checkactivityvssourcesastext: ").append(toIndentedString(checkactivityvssourcesastext)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    closingdatedate: ").append(toIndentedString(closingdatedate)).append("\n");
    sb.append("    plannedcostssubtree: ").append(toIndentedString(plannedcostssubtree)).append("\n");
    sb.append("    plannedrevenuessubtree: ").append(toIndentedString(plannedrevenuessubtree)).append("\n");
    sb.append("    finalizationstatesub: ").append(toIndentedString(finalizationstatesub)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    checkpoints: ").append(toIndentedString(checkpoints)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
