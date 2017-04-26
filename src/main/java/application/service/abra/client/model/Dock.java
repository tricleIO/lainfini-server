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
 * Dock
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Dock   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("definition_id")
  private String definitionId = null;

  @SerializedName("employee_id")
  private String employeeId = null;

  @SerializedName("wageperiod_id")
  private String wageperiodId = null;

  @SerializedName("docktype_id")
  private String docktypeId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("basetype")
  private Integer basetype = null;

  @SerializedName("internal")
  private Boolean internal = null;

  @SerializedName("debtcorrect")
  private Boolean debtcorrect = null;

  @SerializedName("ofminimum")
  private Boolean ofminimum = null;

  @SerializedName("partial")
  private Boolean partial = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("printgroup")
  private String printgroup = null;

  @SerializedName("destination")
  private String destination = null;

  @SerializedName("swiftcode")
  private String swiftcode = null;

  @SerializedName("execauthority")
  private String execauthority = null;

  @SerializedName("execrefnumber")
  private String execrefnumber = null;

  @SerializedName("execrecipient")
  private String execrecipient = null;

  @SerializedName("source_id")
  private String sourceId = null;

  @SerializedName("varsymbol")
  private String varsymbol = null;

  @SerializedName("specsymbol")
  private String specsymbol = null;

  @SerializedName("constsymbol_id")
  private String constsymbolId = null;

  @SerializedName("required")
  private Double required = null;

  @SerializedName("ispercent")
  private Boolean ispercent = null;

  @SerializedName("realized")
  private Double realized = null;

  @SerializedName("percentofcode")
  private Integer percentofcode = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("clsidforpercent")
  private String clsidforpercent = null;

  @SerializedName("isdebt")
  private Boolean isdebt = null;

  @SerializedName("duedate$date")
  private DateTime duedatedate = null;

  @SerializedName("requiredamount")
  private Double requiredamount = null;

  @SerializedName("itisgenerateddebt")
  private Boolean itisgenerateddebt = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("flag")
  private String flag = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("basetype_text")
  private String basetypeText = null;

  @SerializedName("percentofname")
  private String percentofname = null;

  @SerializedName("percentoflabel")
  private String percentoflabel = null;

  @SerializedName("per_personalnumber")
  private String perPersonalnumber = null;

  @SerializedName("numpersonalnumber")
  private Integer numpersonalnumber = null;

  @SerializedName("allowedmaxtorealize")
  private Double allowedmaxtorealize = null;

  @SerializedName("itisgenerated")
  private Boolean itisgenerated = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  @SerializedName("agreementdock")
  private Boolean agreementdock = null;

  @SerializedName("targetbankcountry_id")
  private String targetbankcountryId = null;

  @SerializedName("dockfromagreements")
  private Boolean dockfromagreements = null;

  public Dock displayname(String displayname) {
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

  public Dock id(String id) {
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

  public Dock classid(String classid) {
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

  public Dock objversion(Integer objversion) {
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

  public Dock definitionId(String definitionId) {
    this.definitionId = definitionId;
    return this;
  }

   /**
   * definice; id objektu opakovaná srážka [persistentní položka]
   * @return definitionId
  **/
  @ApiModelProperty(example = "null", value = "definice; id objektu opakovaná srážka [persistentní položka]")
  public String getDefinitionId() {
    return definitionId;
  }

  public void setDefinitionId(String definitionId) {
    this.definitionId = definitionId;
  }

  public Dock employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * zaměstnanec; id objektu zaměstnanec [persistentní položka]
   * @return employeeId
  **/
  @ApiModelProperty(example = "null", value = "zaměstnanec; id objektu zaměstnanec [persistentní položka]")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public Dock wageperiodId(String wageperiodId) {
    this.wageperiodId = wageperiodId;
    return this;
  }

   /**
   * mzdové období; id objektu mzdové období [persistentní položka]
   * @return wageperiodId
  **/
  @ApiModelProperty(example = "null", value = "mzdové období; id objektu mzdové období [persistentní položka]")
  public String getWageperiodId() {
    return wageperiodId;
  }

  public void setWageperiodId(String wageperiodId) {
    this.wageperiodId = wageperiodId;
  }

  public Dock docktypeId(String docktypeId) {
    this.docktypeId = docktypeId;
    return this;
  }

   /**
   * druh srážky; id objektu druh srážky [persistentní položka]
   * @return docktypeId
  **/
  @ApiModelProperty(example = "null", value = "druh srážky; id objektu druh srážky [persistentní položka]")
  public String getDocktypeId() {
    return docktypeId;
  }

  public void setDocktypeId(String docktypeId) {
    this.docktypeId = docktypeId;
  }

  public Dock description(String description) {
    this.description = description;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Dock basetype(Integer basetype) {
    this.basetype = basetype;
    return this;
  }

   /**
   * zákl.typ [persistentní položka]
   * @return basetype
  **/
  @ApiModelProperty(example = "null", value = "zákl.typ [persistentní položka]")
  public Integer getBasetype() {
    return basetype;
  }

  public void setBasetype(Integer basetype) {
    this.basetype = basetype;
  }

  public Dock internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

   /**
   * interní [persistentní položka]
   * @return internal
  **/
  @ApiModelProperty(example = "null", value = "interní [persistentní položka]")
  public Boolean getInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public Dock debtcorrect(Boolean debtcorrect) {
    this.debtcorrect = debtcorrect;
    return this;
  }

   /**
   * vyr.dluž.částku [persistentní položka]
   * @return debtcorrect
  **/
  @ApiModelProperty(example = "null", value = "vyr.dluž.částku [persistentní položka]")
  public Boolean getDebtcorrect() {
    return debtcorrect;
  }

  public void setDebtcorrect(Boolean debtcorrect) {
    this.debtcorrect = debtcorrect;
  }

  public Dock ofminimum(Boolean ofminimum) {
    this.ofminimum = ofminimum;
    return this;
  }

   /**
   * por.s minimem [persistentní položka]
   * @return ofminimum
  **/
  @ApiModelProperty(example = "null", value = "por.s minimem [persistentní položka]")
  public Boolean getOfminimum() {
    return ofminimum;
  }

  public void setOfminimum(Boolean ofminimum) {
    this.ofminimum = ofminimum;
  }

  public Dock partial(Boolean partial) {
    this.partial = partial;
    return this;
  }

   /**
   * i část [persistentní položka]
   * @return partial
  **/
  @ApiModelProperty(example = "null", value = "i část [persistentní položka]")
  public Boolean getPartial() {
    return partial;
  }

  public void setPartial(Boolean partial) {
    this.partial = partial;
  }

  public Dock priority(Integer priority) {
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

  public Dock printgroup(String printgroup) {
    this.printgroup = printgroup;
    return this;
  }

   /**
   * tisk.skup. [persistentní položka]
   * @return printgroup
  **/
  @ApiModelProperty(example = "null", value = "tisk.skup. [persistentní položka]")
  public String getPrintgroup() {
    return printgroup;
  }

  public void setPrintgroup(String printgroup) {
    this.printgroup = printgroup;
  }

  public Dock destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * cílový účet [persistentní položka]
   * @return destination
  **/
  @ApiModelProperty(example = "null", value = "cílový účet [persistentní položka]")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public Dock swiftcode(String swiftcode) {
    this.swiftcode = swiftcode;
    return this;
  }

   /**
   * swift kód [persistentní položka]
   * @return swiftcode
  **/
  @ApiModelProperty(example = "null", value = "swift kód [persistentní položka]")
  public String getSwiftcode() {
    return swiftcode;
  }

  public void setSwiftcode(String swiftcode) {
    this.swiftcode = swiftcode;
  }

  public Dock execauthority(String execauthority) {
    this.execauthority = execauthority;
    return this;
  }

   /**
   * exekuci nařídil [persistentní položka]
   * @return execauthority
  **/
  @ApiModelProperty(example = "null", value = "exekuci nařídil [persistentní položka]")
  public String getExecauthority() {
    return execauthority;
  }

  public void setExecauthority(String execauthority) {
    this.execauthority = execauthority;
  }

  public Dock execrefnumber(String execrefnumber) {
    this.execrefnumber = execrefnumber;
    return this;
  }

   /**
   * Číslo jednací [persistentní položka]
   * @return execrefnumber
  **/
  @ApiModelProperty(example = "null", value = "Číslo jednací [persistentní položka]")
  public String getExecrefnumber() {
    return execrefnumber;
  }

  public void setExecrefnumber(String execrefnumber) {
    this.execrefnumber = execrefnumber;
  }

  public Dock execrecipient(String execrecipient) {
    this.execrecipient = execrecipient;
    return this;
  }

   /**
   * oprávněný [persistentní položka]
   * @return execrecipient
  **/
  @ApiModelProperty(example = "null", value = "oprávněný [persistentní položka]")
  public String getExecrecipient() {
    return execrecipient;
  }

  public void setExecrecipient(String execrecipient) {
    this.execrecipient = execrecipient;
  }

  public Dock sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * zdrojový účet; id objektu bankovní účet [persistentní položka]
   * @return sourceId
  **/
  @ApiModelProperty(example = "null", value = "zdrojový účet; id objektu bankovní účet [persistentní položka]")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public Dock varsymbol(String varsymbol) {
    this.varsymbol = varsymbol;
    return this;
  }

   /**
   * var.symbol [persistentní položka]
   * @return varsymbol
  **/
  @ApiModelProperty(example = "null", value = "var.symbol [persistentní položka]")
  public String getVarsymbol() {
    return varsymbol;
  }

  public void setVarsymbol(String varsymbol) {
    this.varsymbol = varsymbol;
  }

  public Dock specsymbol(String specsymbol) {
    this.specsymbol = specsymbol;
    return this;
  }

   /**
   * spec.symbol [persistentní položka]
   * @return specsymbol
  **/
  @ApiModelProperty(example = "null", value = "spec.symbol [persistentní položka]")
  public String getSpecsymbol() {
    return specsymbol;
  }

  public void setSpecsymbol(String specsymbol) {
    this.specsymbol = specsymbol;
  }

  public Dock constsymbolId(String constsymbolId) {
    this.constsymbolId = constsymbolId;
    return this;
  }

   /**
   * konst.symbol; id objektu konstantní symbol [persistentní položka]
   * @return constsymbolId
  **/
  @ApiModelProperty(example = "null", value = "konst.symbol; id objektu konstantní symbol [persistentní položka]")
  public String getConstsymbolId() {
    return constsymbolId;
  }

  public void setConstsymbolId(String constsymbolId) {
    this.constsymbolId = constsymbolId;
  }

  public Dock required(Double required) {
    this.required = required;
    return this;
  }

   /**
   * předepsáno [persistentní položka]
   * @return required
  **/
  @ApiModelProperty(example = "null", value = "předepsáno [persistentní položka]")
  public Double getRequired() {
    return required;
  }

  public void setRequired(Double required) {
    this.required = required;
  }

  public Dock ispercent(Boolean ispercent) {
    this.ispercent = ispercent;
    return this;
  }

   /**
   * procentem [persistentní položka]
   * @return ispercent
  **/
  @ApiModelProperty(example = "null", value = "procentem [persistentní položka]")
  public Boolean getIspercent() {
    return ispercent;
  }

  public void setIspercent(Boolean ispercent) {
    this.ispercent = ispercent;
  }

  public Dock realized(Double realized) {
    this.realized = realized;
    return this;
  }

   /**
   * realizováno [persistentní položka]
   * @return realized
  **/
  @ApiModelProperty(example = "null", value = "realizováno [persistentní položka]")
  public Double getRealized() {
    return realized;
  }

  public void setRealized(Double realized) {
    this.realized = realized;
  }

  public Dock percentofcode(Integer percentofcode) {
    this.percentofcode = percentofcode;
    return this;
  }

   /**
   * položka ml [persistentní položka]
   * @return percentofcode
  **/
  @ApiModelProperty(example = "null", value = "položka ml [persistentní položka]")
  public Integer getPercentofcode() {
    return percentofcode;
  }

  public void setPercentofcode(Integer percentofcode) {
    this.percentofcode = percentofcode;
  }

  public Dock createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * vytvořil; id objektu uživatel [persistentní položka]
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "vytvořil; id objektu uživatel [persistentní položka]")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Dock correctedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
    return this;
  }

   /**
   * opravil; id objektu uživatel [persistentní položka]
   * @return correctedbyId
  **/
  @ApiModelProperty(example = "null", value = "opravil; id objektu uživatel [persistentní položka]")
  public String getCorrectedbyId() {
    return correctedbyId;
  }

  public void setCorrectedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
  }

  public Dock clsidforpercent(String clsidforpercent) {
    this.clsidforpercent = clsidforpercent;
    return this;
  }

   /**
   * třída objektu [persistentní položka]
   * @return clsidforpercent
  **/
  @ApiModelProperty(example = "null", value = "třída objektu [persistentní položka]")
  public String getClsidforpercent() {
    return clsidforpercent;
  }

  public void setClsidforpercent(String clsidforpercent) {
    this.clsidforpercent = clsidforpercent;
  }

  public Dock isdebt(Boolean isdebt) {
    this.isdebt = isdebt;
    return this;
  }

   /**
   * dluh [persistentní položka]
   * @return isdebt
  **/
  @ApiModelProperty(example = "null", value = "dluh [persistentní položka]")
  public Boolean getIsdebt() {
    return isdebt;
  }

  public void setIsdebt(Boolean isdebt) {
    this.isdebt = isdebt;
  }

  public Dock duedatedate(DateTime duedatedate) {
    this.duedatedate = duedatedate;
    return this;
  }

   /**
   * datum splatnosti [persistentní položka]
   * @return duedatedate
  **/
  @ApiModelProperty(example = "null", value = "datum splatnosti [persistentní položka]")
  public DateTime getDuedatedate() {
    return duedatedate;
  }

  public void setDuedatedate(DateTime duedatedate) {
    this.duedatedate = duedatedate;
  }

  public Dock requiredamount(Double requiredamount) {
    this.requiredamount = requiredamount;
    return this;
  }

   /**
   * předepsaná částka [persistentní položka]
   * @return requiredamount
  **/
  @ApiModelProperty(example = "null", value = "předepsaná částka [persistentní položka]")
  public Double getRequiredamount() {
    return requiredamount;
  }

  public void setRequiredamount(Double requiredamount) {
    this.requiredamount = requiredamount;
  }

  public Dock itisgenerateddebt(Boolean itisgenerateddebt) {
    this.itisgenerateddebt = itisgenerateddebt;
    return this;
  }

   /**
   * generovaný dluh [persistentní položka]
   * @return itisgenerateddebt
  **/
  @ApiModelProperty(example = "null", value = "generovaný dluh [persistentní položka]")
  public Boolean getItisgenerateddebt() {
    return itisgenerateddebt;
  }

  public void setItisgenerateddebt(Boolean itisgenerateddebt) {
    this.itisgenerateddebt = itisgenerateddebt;
  }

  public Dock busorderId(String busorderId) {
    this.busorderId = busorderId;
    return this;
  }

   /**
   * obch. případ; id objektu zakázka [persistentní položka]
   * @return busorderId
  **/
  @ApiModelProperty(example = "null", value = "obch. případ; id objektu zakázka [persistentní položka]")
  public String getBusorderId() {
    return busorderId;
  }

  public void setBusorderId(String busorderId) {
    this.busorderId = busorderId;
  }

  public Dock bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * zakázka; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "zakázka; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Dock flag(String flag) {
    this.flag = flag;
    return this;
  }

   /**
   * rozl. řetězec [persistentní položka]
   * @return flag
  **/
  @ApiModelProperty(example = "null", value = "rozl. řetězec [persistentní položka]")
  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  public Dock divisionId(String divisionId) {
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

  public Dock basetypeText(String basetypeText) {
    this.basetypeText = basetypeText;
    return this;
  }

   /**
   * zákl.typ
   * @return basetypeText
  **/
  @ApiModelProperty(example = "null", value = "zákl.typ")
  public String getBasetypeText() {
    return basetypeText;
  }

  public void setBasetypeText(String basetypeText) {
    this.basetypeText = basetypeText;
  }

  public Dock percentofname(String percentofname) {
    this.percentofname = percentofname;
    return this;
  }

   /**
   * položka - jméno
   * @return percentofname
  **/
  @ApiModelProperty(example = "null", value = "položka - jméno")
  public String getPercentofname() {
    return percentofname;
  }

  public void setPercentofname(String percentofname) {
    this.percentofname = percentofname;
  }

  public Dock percentoflabel(String percentoflabel) {
    this.percentoflabel = percentoflabel;
    return this;
  }

   /**
   * položka - popis
   * @return percentoflabel
  **/
  @ApiModelProperty(example = "null", value = "položka - popis")
  public String getPercentoflabel() {
    return percentoflabel;
  }

  public void setPercentoflabel(String percentoflabel) {
    this.percentoflabel = percentoflabel;
  }

  public Dock perPersonalnumber(String perPersonalnumber) {
    this.perPersonalnumber = perPersonalnumber;
    return this;
  }

   /**
   * os.číslo
   * @return perPersonalnumber
  **/
  @ApiModelProperty(example = "null", value = "os.číslo")
  public String getPerPersonalnumber() {
    return perPersonalnumber;
  }

  public void setPerPersonalnumber(String perPersonalnumber) {
    this.perPersonalnumber = perPersonalnumber;
  }

  public Dock numpersonalnumber(Integer numpersonalnumber) {
    this.numpersonalnumber = numpersonalnumber;
    return this;
  }

   /**
   * os.číslo numericky
   * @return numpersonalnumber
  **/
  @ApiModelProperty(example = "null", value = "os.číslo numericky")
  public Integer getNumpersonalnumber() {
    return numpersonalnumber;
  }

  public void setNumpersonalnumber(Integer numpersonalnumber) {
    this.numpersonalnumber = numpersonalnumber;
  }

  public Dock allowedmaxtorealize(Double allowedmaxtorealize) {
    this.allowedmaxtorealize = allowedmaxtorealize;
    return this;
  }

   /**
   * maximálně povoleno srazit. [persistentní položka]
   * @return allowedmaxtorealize
  **/
  @ApiModelProperty(example = "null", value = "maximálně povoleno srazit. [persistentní položka]")
  public Double getAllowedmaxtorealize() {
    return allowedmaxtorealize;
  }

  public void setAllowedmaxtorealize(Double allowedmaxtorealize) {
    this.allowedmaxtorealize = allowedmaxtorealize;
  }

  public Dock itisgenerated(Boolean itisgenerated) {
    this.itisgenerated = itisgenerated;
    return this;
  }

   /**
   * generovaná srážka
   * @return itisgenerated
  **/
  @ApiModelProperty(example = "null", value = "generovaná srážka")
  public Boolean getItisgenerated() {
    return itisgenerated;
  }

  public void setItisgenerated(Boolean itisgenerated) {
    this.itisgenerated = itisgenerated;
  }

  public Dock busprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
    return this;
  }

   /**
   * projekt; id objektu projekt [persistentní položka]
   * @return busprojectId
  **/
  @ApiModelProperty(example = "null", value = "projekt; id objektu projekt [persistentní položka]")
  public String getBusprojectId() {
    return busprojectId;
  }

  public void setBusprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
  }

  public Dock agreementdock(Boolean agreementdock) {
    this.agreementdock = agreementdock;
    return this;
  }

   /**
   * smluvní srážka [persistentní položka]
   * @return agreementdock
  **/
  @ApiModelProperty(example = "null", value = "smluvní srážka [persistentní položka]")
  public Boolean getAgreementdock() {
    return agreementdock;
  }

  public void setAgreementdock(Boolean agreementdock) {
    this.agreementdock = agreementdock;
  }

  public Dock targetbankcountryId(String targetbankcountryId) {
    this.targetbankcountryId = targetbankcountryId;
    return this;
  }

   /**
   * země banky; id objektu země [persistentní položka]
   * @return targetbankcountryId
  **/
  @ApiModelProperty(example = "null", value = "země banky; id objektu země [persistentní položka]")
  public String getTargetbankcountryId() {
    return targetbankcountryId;
  }

  public void setTargetbankcountryId(String targetbankcountryId) {
    this.targetbankcountryId = targetbankcountryId;
  }

  public Dock dockfromagreements(Boolean dockfromagreements) {
    this.dockfromagreements = dockfromagreements;
    return this;
  }

   /**
   * srážet i z dohod [persistentní položka]
   * @return dockfromagreements
  **/
  @ApiModelProperty(example = "null", value = "srážet i z dohod [persistentní položka]")
  public Boolean getDockfromagreements() {
    return dockfromagreements;
  }

  public void setDockfromagreements(Boolean dockfromagreements) {
    this.dockfromagreements = dockfromagreements;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dock dock = (Dock) o;
    return Objects.equals(this.displayname, dock.displayname) &&
        Objects.equals(this.id, dock.id) &&
        Objects.equals(this.classid, dock.classid) &&
        Objects.equals(this.objversion, dock.objversion) &&
        Objects.equals(this.definitionId, dock.definitionId) &&
        Objects.equals(this.employeeId, dock.employeeId) &&
        Objects.equals(this.wageperiodId, dock.wageperiodId) &&
        Objects.equals(this.docktypeId, dock.docktypeId) &&
        Objects.equals(this.description, dock.description) &&
        Objects.equals(this.basetype, dock.basetype) &&
        Objects.equals(this.internal, dock.internal) &&
        Objects.equals(this.debtcorrect, dock.debtcorrect) &&
        Objects.equals(this.ofminimum, dock.ofminimum) &&
        Objects.equals(this.partial, dock.partial) &&
        Objects.equals(this.priority, dock.priority) &&
        Objects.equals(this.printgroup, dock.printgroup) &&
        Objects.equals(this.destination, dock.destination) &&
        Objects.equals(this.swiftcode, dock.swiftcode) &&
        Objects.equals(this.execauthority, dock.execauthority) &&
        Objects.equals(this.execrefnumber, dock.execrefnumber) &&
        Objects.equals(this.execrecipient, dock.execrecipient) &&
        Objects.equals(this.sourceId, dock.sourceId) &&
        Objects.equals(this.varsymbol, dock.varsymbol) &&
        Objects.equals(this.specsymbol, dock.specsymbol) &&
        Objects.equals(this.constsymbolId, dock.constsymbolId) &&
        Objects.equals(this.required, dock.required) &&
        Objects.equals(this.ispercent, dock.ispercent) &&
        Objects.equals(this.realized, dock.realized) &&
        Objects.equals(this.percentofcode, dock.percentofcode) &&
        Objects.equals(this.createdbyId, dock.createdbyId) &&
        Objects.equals(this.correctedbyId, dock.correctedbyId) &&
        Objects.equals(this.clsidforpercent, dock.clsidforpercent) &&
        Objects.equals(this.isdebt, dock.isdebt) &&
        Objects.equals(this.duedatedate, dock.duedatedate) &&
        Objects.equals(this.requiredamount, dock.requiredamount) &&
        Objects.equals(this.itisgenerateddebt, dock.itisgenerateddebt) &&
        Objects.equals(this.busorderId, dock.busorderId) &&
        Objects.equals(this.bustransactionId, dock.bustransactionId) &&
        Objects.equals(this.flag, dock.flag) &&
        Objects.equals(this.divisionId, dock.divisionId) &&
        Objects.equals(this.basetypeText, dock.basetypeText) &&
        Objects.equals(this.percentofname, dock.percentofname) &&
        Objects.equals(this.percentoflabel, dock.percentoflabel) &&
        Objects.equals(this.perPersonalnumber, dock.perPersonalnumber) &&
        Objects.equals(this.numpersonalnumber, dock.numpersonalnumber) &&
        Objects.equals(this.allowedmaxtorealize, dock.allowedmaxtorealize) &&
        Objects.equals(this.itisgenerated, dock.itisgenerated) &&
        Objects.equals(this.busprojectId, dock.busprojectId) &&
        Objects.equals(this.agreementdock, dock.agreementdock) &&
        Objects.equals(this.targetbankcountryId, dock.targetbankcountryId) &&
        Objects.equals(this.dockfromagreements, dock.dockfromagreements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, definitionId, employeeId, wageperiodId, docktypeId, description, basetype, internal, debtcorrect, ofminimum, partial, priority, printgroup, destination, swiftcode, execauthority, execrefnumber, execrecipient, sourceId, varsymbol, specsymbol, constsymbolId, required, ispercent, realized, percentofcode, createdbyId, correctedbyId, clsidforpercent, isdebt, duedatedate, requiredamount, itisgenerateddebt, busorderId, bustransactionId, flag, divisionId, basetypeText, percentofname, percentoflabel, perPersonalnumber, numpersonalnumber, allowedmaxtorealize, itisgenerated, busprojectId, agreementdock, targetbankcountryId, dockfromagreements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dock {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    definitionId: ").append(toIndentedString(definitionId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    wageperiodId: ").append(toIndentedString(wageperiodId)).append("\n");
    sb.append("    docktypeId: ").append(toIndentedString(docktypeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    basetype: ").append(toIndentedString(basetype)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    debtcorrect: ").append(toIndentedString(debtcorrect)).append("\n");
    sb.append("    ofminimum: ").append(toIndentedString(ofminimum)).append("\n");
    sb.append("    partial: ").append(toIndentedString(partial)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    printgroup: ").append(toIndentedString(printgroup)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    swiftcode: ").append(toIndentedString(swiftcode)).append("\n");
    sb.append("    execauthority: ").append(toIndentedString(execauthority)).append("\n");
    sb.append("    execrefnumber: ").append(toIndentedString(execrefnumber)).append("\n");
    sb.append("    execrecipient: ").append(toIndentedString(execrecipient)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    varsymbol: ").append(toIndentedString(varsymbol)).append("\n");
    sb.append("    specsymbol: ").append(toIndentedString(specsymbol)).append("\n");
    sb.append("    constsymbolId: ").append(toIndentedString(constsymbolId)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    ispercent: ").append(toIndentedString(ispercent)).append("\n");
    sb.append("    realized: ").append(toIndentedString(realized)).append("\n");
    sb.append("    percentofcode: ").append(toIndentedString(percentofcode)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    clsidforpercent: ").append(toIndentedString(clsidforpercent)).append("\n");
    sb.append("    isdebt: ").append(toIndentedString(isdebt)).append("\n");
    sb.append("    duedatedate: ").append(toIndentedString(duedatedate)).append("\n");
    sb.append("    requiredamount: ").append(toIndentedString(requiredamount)).append("\n");
    sb.append("    itisgenerateddebt: ").append(toIndentedString(itisgenerateddebt)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    basetypeText: ").append(toIndentedString(basetypeText)).append("\n");
    sb.append("    percentofname: ").append(toIndentedString(percentofname)).append("\n");
    sb.append("    percentoflabel: ").append(toIndentedString(percentoflabel)).append("\n");
    sb.append("    perPersonalnumber: ").append(toIndentedString(perPersonalnumber)).append("\n");
    sb.append("    numpersonalnumber: ").append(toIndentedString(numpersonalnumber)).append("\n");
    sb.append("    allowedmaxtorealize: ").append(toIndentedString(allowedmaxtorealize)).append("\n");
    sb.append("    itisgenerated: ").append(toIndentedString(itisgenerated)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
    sb.append("    agreementdock: ").append(toIndentedString(agreementdock)).append("\n");
    sb.append("    targetbankcountryId: ").append(toIndentedString(targetbankcountryId)).append("\n");
    sb.append("    dockfromagreements: ").append(toIndentedString(dockfromagreements)).append("\n");
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

