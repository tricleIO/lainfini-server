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
 * Crmactivitytype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Crmactivitytype   {
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

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("isprivate")
  private Boolean isprivate = null;

  @SerializedName("solverrole_id")
  private String solverroleId = null;

  @SerializedName("offset$date")
  private DateTime offsetdate = null;

  @SerializedName("duration$date")
  private DateTime durationdate = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("firm_id")
  private String firmId = null;

  @SerializedName("person_id")
  private String personId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("product_id")
  private String productId = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  @SerializedName("activityprocess_id")
  private String activityprocessId = null;

  @SerializedName("issheduled")
  private Boolean issheduled = null;

  @SerializedName("firmreq")
  private Integer firmreq = null;

  @SerializedName("personreq")
  private Integer personreq = null;

  @SerializedName("busorderreq")
  private Integer busorderreq = null;

  @SerializedName("bustransactionreq")
  private Integer bustransactionreq = null;

  @SerializedName("productreq")
  private Integer productreq = null;

  @SerializedName("busprojectreq")
  private Integer busprojectreq = null;

  @SerializedName("processisrequired")
  private Boolean processisrequired = null;

  @SerializedName("passsolverrole")
  private Boolean passsolverrole = null;

  @SerializedName("generateissueddoc")
  private Boolean generateissueddoc = null;

  @SerializedName("solveruser_id")
  private String solveruserId = null;

  @SerializedName("isroleprotected")
  private Boolean isroleprotected = null;

  @SerializedName("nocollisioncheck")
  private Boolean nocollisioncheck = null;

  @SerializedName("businessrelationship")
  private Boolean businessrelationship = null;

  @SerializedName("usecontacts")
  private Boolean usecontacts = null;

  @SerializedName("busdivisionreq")
  private Integer busdivisionreq = null;

  public Crmactivitytype displayname(String displayname) {
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

  public Crmactivitytype id(String id) {
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

  public Crmactivitytype classid(String classid) {
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

  public Crmactivitytype objversion(Integer objversion) {
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

  public Crmactivitytype hidden(Boolean hidden) {
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

  public Crmactivitytype code(String code) {
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

  public Crmactivitytype name(String name) {
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

  public Crmactivitytype priority(Integer priority) {
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

  public Crmactivitytype status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * stav aktivity [persistentní položka]
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "stav aktivity [persistentní položka]")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Crmactivitytype isprivate(Boolean isprivate) {
    this.isprivate = isprivate;
    return this;
  }

   /**
   * neveřejná akt. [persistentní položka]
   * @return isprivate
  **/
  @ApiModelProperty(example = "null", value = "neveřejná akt. [persistentní položka]")
  public Boolean getIsprivate() {
    return isprivate;
  }

  public void setIsprivate(Boolean isprivate) {
    this.isprivate = isprivate;
  }

  public Crmactivitytype solverroleId(String solverroleId) {
    this.solverroleId = solverroleId;
    return this;
  }

   /**
   * role řešitele; id objektu role [persistentní položka]
   * @return solverroleId
  **/
  @ApiModelProperty(example = "null", value = "role řešitele; id objektu role [persistentní položka]")
  public String getSolverroleId() {
    return solverroleId;
  }

  public void setSolverroleId(String solverroleId) {
    this.solverroleId = solverroleId;
  }

  public Crmactivitytype offsetdate(DateTime offsetdate) {
    this.offsetdate = offsetdate;
    return this;
  }

   /**
   * Čas zahájení [persistentní položka]
   * @return offsetdate
  **/
  @ApiModelProperty(example = "null", value = "Čas zahájení [persistentní položka]")
  public DateTime getOffsetdate() {
    return offsetdate;
  }

  public void setOffsetdate(DateTime offsetdate) {
    this.offsetdate = offsetdate;
  }

  public Crmactivitytype durationdate(DateTime durationdate) {
    this.durationdate = durationdate;
    return this;
  }

   /**
   * doba trvání [persistentní položka]
   * @return durationdate
  **/
  @ApiModelProperty(example = "null", value = "doba trvání [persistentní položka]")
  public DateTime getDurationdate() {
    return durationdate;
  }

  public void setDurationdate(DateTime durationdate) {
    this.durationdate = durationdate;
  }

  public Crmactivitytype subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * předmět [persistentní položka]
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "předmět [persistentní položka]")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Crmactivitytype description(String description) {
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

  public Crmactivitytype firmId(String firmId) {
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

  public Crmactivitytype personId(String personId) {
    this.personId = personId;
    return this;
  }

   /**
   * osoba; id objektu osoba [persistentní položka]
   * @return personId
  **/
  @ApiModelProperty(example = "null", value = "osoba; id objektu osoba [persistentní položka]")
  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public Crmactivitytype busorderId(String busorderId) {
    this.busorderId = busorderId;
    return this;
  }

   /**
   * zakázka; id objektu zakázka [persistentní položka]
   * @return busorderId
  **/
  @ApiModelProperty(example = "null", value = "zakázka; id objektu zakázka [persistentní položka]")
  public String getBusorderId() {
    return busorderId;
  }

  public void setBusorderId(String busorderId) {
    this.busorderId = busorderId;
  }

  public Crmactivitytype bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * obch.případ; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "obch.případ; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Crmactivitytype divisionId(String divisionId) {
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

  public Crmactivitytype productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * produkt; id objektu produkt [persistentní položka]
   * @return productId
  **/
  @ApiModelProperty(example = "null", value = "produkt; id objektu produkt [persistentní položka]")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Crmactivitytype busprojectId(String busprojectId) {
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

  public Crmactivitytype activityprocessId(String activityprocessId) {
    this.activityprocessId = activityprocessId;
    return this;
  }

   /**
   * proces aktivity; id objektu proces aktivit [persistentní položka]
   * @return activityprocessId
  **/
  @ApiModelProperty(example = "null", value = "proces aktivity; id objektu proces aktivit [persistentní položka]")
  public String getActivityprocessId() {
    return activityprocessId;
  }

  public void setActivityprocessId(String activityprocessId) {
    this.activityprocessId = activityprocessId;
  }

  public Crmactivitytype issheduled(Boolean issheduled) {
    this.issheduled = issheduled;
    return this;
  }

   /**
   * je plánováno [persistentní položka]
   * @return issheduled
  **/
  @ApiModelProperty(example = "null", value = "je plánováno [persistentní položka]")
  public Boolean getIssheduled() {
    return issheduled;
  }

  public void setIssheduled(Boolean issheduled) {
    this.issheduled = issheduled;
  }

  public Crmactivitytype firmreq(Integer firmreq) {
    this.firmreq = firmreq;
    return this;
  }

   /**
   * vyplňovat firmu [persistentní položka]
   * @return firmreq
  **/
  @ApiModelProperty(example = "null", value = "vyplňovat firmu [persistentní položka]")
  public Integer getFirmreq() {
    return firmreq;
  }

  public void setFirmreq(Integer firmreq) {
    this.firmreq = firmreq;
  }

  public Crmactivitytype personreq(Integer personreq) {
    this.personreq = personreq;
    return this;
  }

   /**
   * vyplňovat osobu [persistentní položka]
   * @return personreq
  **/
  @ApiModelProperty(example = "null", value = "vyplňovat osobu [persistentní položka]")
  public Integer getPersonreq() {
    return personreq;
  }

  public void setPersonreq(Integer personreq) {
    this.personreq = personreq;
  }

  public Crmactivitytype busorderreq(Integer busorderreq) {
    this.busorderreq = busorderreq;
    return this;
  }

   /**
   * vyplňovat zakázku [persistentní položka]
   * @return busorderreq
  **/
  @ApiModelProperty(example = "null", value = "vyplňovat zakázku [persistentní položka]")
  public Integer getBusorderreq() {
    return busorderreq;
  }

  public void setBusorderreq(Integer busorderreq) {
    this.busorderreq = busorderreq;
  }

  public Crmactivitytype bustransactionreq(Integer bustransactionreq) {
    this.bustransactionreq = bustransactionreq;
    return this;
  }

   /**
   * vyplňovat obch.případ [persistentní položka]
   * @return bustransactionreq
  **/
  @ApiModelProperty(example = "null", value = "vyplňovat obch.případ [persistentní položka]")
  public Integer getBustransactionreq() {
    return bustransactionreq;
  }

  public void setBustransactionreq(Integer bustransactionreq) {
    this.bustransactionreq = bustransactionreq;
  }

  public Crmactivitytype productreq(Integer productreq) {
    this.productreq = productreq;
    return this;
  }

   /**
   * vyplňovat produkt [persistentní položka]
   * @return productreq
  **/
  @ApiModelProperty(example = "null", value = "vyplňovat produkt [persistentní položka]")
  public Integer getProductreq() {
    return productreq;
  }

  public void setProductreq(Integer productreq) {
    this.productreq = productreq;
  }

  public Crmactivitytype busprojectreq(Integer busprojectreq) {
    this.busprojectreq = busprojectreq;
    return this;
  }

   /**
   * vyplňovat projekt [persistentní položka]
   * @return busprojectreq
  **/
  @ApiModelProperty(example = "null", value = "vyplňovat projekt [persistentní položka]")
  public Integer getBusprojectreq() {
    return busprojectreq;
  }

  public void setBusprojectreq(Integer busprojectreq) {
    this.busprojectreq = busprojectreq;
  }

  public Crmactivitytype processisrequired(Boolean processisrequired) {
    this.processisrequired = processisrequired;
    return this;
  }

   /**
   * je proces povinný [persistentní položka]
   * @return processisrequired
  **/
  @ApiModelProperty(example = "null", value = "je proces povinný [persistentní položka]")
  public Boolean getProcessisrequired() {
    return processisrequired;
  }

  public void setProcessisrequired(Boolean processisrequired) {
    this.processisrequired = processisrequired;
  }

  public Crmactivitytype passsolverrole(Boolean passsolverrole) {
    this.passsolverrole = passsolverrole;
    return this;
  }

   /**
   * převzít roli řešitele při předání [persistentní položka]
   * @return passsolverrole
  **/
  @ApiModelProperty(example = "null", value = "převzít roli řešitele při předání [persistentní položka]")
  public Boolean getPasssolverrole() {
    return passsolverrole;
  }

  public void setPasssolverrole(Boolean passsolverrole) {
    this.passsolverrole = passsolverrole;
  }

  public Crmactivitytype generateissueddoc(Boolean generateissueddoc) {
    this.generateissueddoc = generateissueddoc;
    return this;
  }

   /**
   * generovat odeslanou poštu [persistentní položka]
   * @return generateissueddoc
  **/
  @ApiModelProperty(example = "null", value = "generovat odeslanou poštu [persistentní položka]")
  public Boolean getGenerateissueddoc() {
    return generateissueddoc;
  }

  public void setGenerateissueddoc(Boolean generateissueddoc) {
    this.generateissueddoc = generateissueddoc;
  }

  public Crmactivitytype solveruserId(String solveruserId) {
    this.solveruserId = solveruserId;
    return this;
  }

   /**
   * Řešitel; id objektu uživatel [persistentní položka]
   * @return solveruserId
  **/
  @ApiModelProperty(example = "null", value = "Řešitel; id objektu uživatel [persistentní položka]")
  public String getSolveruserId() {
    return solveruserId;
  }

  public void setSolveruserId(String solveruserId) {
    this.solveruserId = solveruserId;
  }

  public Crmactivitytype isroleprotected(Boolean isroleprotected) {
    this.isroleprotected = isroleprotected;
    return this;
  }

   /**
   * povolit opravu pouze řešiteli a nadřízeným rolím [persistentní položka]
   * @return isroleprotected
  **/
  @ApiModelProperty(example = "null", value = "povolit opravu pouze řešiteli a nadřízeným rolím [persistentní položka]")
  public Boolean getIsroleprotected() {
    return isroleprotected;
  }

  public void setIsroleprotected(Boolean isroleprotected) {
    this.isroleprotected = isroleprotected;
  }

  public Crmactivitytype nocollisioncheck(Boolean nocollisioncheck) {
    this.nocollisioncheck = nocollisioncheck;
    return this;
  }

   /**
   * nekontrolovat kolize s jinými aktivitami [persistentní položka]
   * @return nocollisioncheck
  **/
  @ApiModelProperty(example = "null", value = "nekontrolovat kolize s jinými aktivitami [persistentní položka]")
  public Boolean getNocollisioncheck() {
    return nocollisioncheck;
  }

  public void setNocollisioncheck(Boolean nocollisioncheck) {
    this.nocollisioncheck = nocollisioncheck;
  }

  public Crmactivitytype businessrelationship(Boolean businessrelationship) {
    this.businessrelationship = businessrelationship;
    return this;
  }

   /**
   * aktivita pro sledování obchodního vztahu [persistentní položka]
   * @return businessrelationship
  **/
  @ApiModelProperty(example = "null", value = "aktivita pro sledování obchodního vztahu [persistentní položka]")
  public Boolean getBusinessrelationship() {
    return businessrelationship;
  }

  public void setBusinessrelationship(Boolean businessrelationship) {
    this.businessrelationship = businessrelationship;
  }

  public Crmactivitytype usecontacts(Boolean usecontacts) {
    this.usecontacts = usecontacts;
    return this;
  }

   /**
   * používat kontakty [persistentní položka]
   * @return usecontacts
  **/
  @ApiModelProperty(example = "null", value = "používat kontakty [persistentní položka]")
  public Boolean getUsecontacts() {
    return usecontacts;
  }

  public void setUsecontacts(Boolean usecontacts) {
    this.usecontacts = usecontacts;
  }

  public Crmactivitytype busdivisionreq(Integer busdivisionreq) {
    this.busdivisionreq = busdivisionreq;
    return this;
  }

   /**
   * vyplňovat středisko [persistentní položka]
   * @return busdivisionreq
  **/
  @ApiModelProperty(example = "null", value = "vyplňovat středisko [persistentní položka]")
  public Integer getBusdivisionreq() {
    return busdivisionreq;
  }

  public void setBusdivisionreq(Integer busdivisionreq) {
    this.busdivisionreq = busdivisionreq;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Crmactivitytype crmactivitytype = (Crmactivitytype) o;
    return Objects.equals(this.displayname, crmactivitytype.displayname) &&
        Objects.equals(this.id, crmactivitytype.id) &&
        Objects.equals(this.classid, crmactivitytype.classid) &&
        Objects.equals(this.objversion, crmactivitytype.objversion) &&
        Objects.equals(this.hidden, crmactivitytype.hidden) &&
        Objects.equals(this.code, crmactivitytype.code) &&
        Objects.equals(this.name, crmactivitytype.name) &&
        Objects.equals(this.priority, crmactivitytype.priority) &&
        Objects.equals(this.status, crmactivitytype.status) &&
        Objects.equals(this.isprivate, crmactivitytype.isprivate) &&
        Objects.equals(this.solverroleId, crmactivitytype.solverroleId) &&
        Objects.equals(this.offsetdate, crmactivitytype.offsetdate) &&
        Objects.equals(this.durationdate, crmactivitytype.durationdate) &&
        Objects.equals(this.subject, crmactivitytype.subject) &&
        Objects.equals(this.description, crmactivitytype.description) &&
        Objects.equals(this.firmId, crmactivitytype.firmId) &&
        Objects.equals(this.personId, crmactivitytype.personId) &&
        Objects.equals(this.busorderId, crmactivitytype.busorderId) &&
        Objects.equals(this.bustransactionId, crmactivitytype.bustransactionId) &&
        Objects.equals(this.divisionId, crmactivitytype.divisionId) &&
        Objects.equals(this.productId, crmactivitytype.productId) &&
        Objects.equals(this.busprojectId, crmactivitytype.busprojectId) &&
        Objects.equals(this.activityprocessId, crmactivitytype.activityprocessId) &&
        Objects.equals(this.issheduled, crmactivitytype.issheduled) &&
        Objects.equals(this.firmreq, crmactivitytype.firmreq) &&
        Objects.equals(this.personreq, crmactivitytype.personreq) &&
        Objects.equals(this.busorderreq, crmactivitytype.busorderreq) &&
        Objects.equals(this.bustransactionreq, crmactivitytype.bustransactionreq) &&
        Objects.equals(this.productreq, crmactivitytype.productreq) &&
        Objects.equals(this.busprojectreq, crmactivitytype.busprojectreq) &&
        Objects.equals(this.processisrequired, crmactivitytype.processisrequired) &&
        Objects.equals(this.passsolverrole, crmactivitytype.passsolverrole) &&
        Objects.equals(this.generateissueddoc, crmactivitytype.generateissueddoc) &&
        Objects.equals(this.solveruserId, crmactivitytype.solveruserId) &&
        Objects.equals(this.isroleprotected, crmactivitytype.isroleprotected) &&
        Objects.equals(this.nocollisioncheck, crmactivitytype.nocollisioncheck) &&
        Objects.equals(this.businessrelationship, crmactivitytype.businessrelationship) &&
        Objects.equals(this.usecontacts, crmactivitytype.usecontacts) &&
        Objects.equals(this.busdivisionreq, crmactivitytype.busdivisionreq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, code, name, priority, status, isprivate, solverroleId, offsetdate, durationdate, subject, description, firmId, personId, busorderId, bustransactionId, divisionId, productId, busprojectId, activityprocessId, issheduled, firmreq, personreq, busorderreq, bustransactionreq, productreq, busprojectreq, processisrequired, passsolverrole, generateissueddoc, solveruserId, isroleprotected, nocollisioncheck, businessrelationship, usecontacts, busdivisionreq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Crmactivitytype {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isprivate: ").append(toIndentedString(isprivate)).append("\n");
    sb.append("    solverroleId: ").append(toIndentedString(solverroleId)).append("\n");
    sb.append("    offsetdate: ").append(toIndentedString(offsetdate)).append("\n");
    sb.append("    durationdate: ").append(toIndentedString(durationdate)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    firmId: ").append(toIndentedString(firmId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
    sb.append("    activityprocessId: ").append(toIndentedString(activityprocessId)).append("\n");
    sb.append("    issheduled: ").append(toIndentedString(issheduled)).append("\n");
    sb.append("    firmreq: ").append(toIndentedString(firmreq)).append("\n");
    sb.append("    personreq: ").append(toIndentedString(personreq)).append("\n");
    sb.append("    busorderreq: ").append(toIndentedString(busorderreq)).append("\n");
    sb.append("    bustransactionreq: ").append(toIndentedString(bustransactionreq)).append("\n");
    sb.append("    productreq: ").append(toIndentedString(productreq)).append("\n");
    sb.append("    busprojectreq: ").append(toIndentedString(busprojectreq)).append("\n");
    sb.append("    processisrequired: ").append(toIndentedString(processisrequired)).append("\n");
    sb.append("    passsolverrole: ").append(toIndentedString(passsolverrole)).append("\n");
    sb.append("    generateissueddoc: ").append(toIndentedString(generateissueddoc)).append("\n");
    sb.append("    solveruserId: ").append(toIndentedString(solveruserId)).append("\n");
    sb.append("    isroleprotected: ").append(toIndentedString(isroleprotected)).append("\n");
    sb.append("    nocollisioncheck: ").append(toIndentedString(nocollisioncheck)).append("\n");
    sb.append("    businessrelationship: ").append(toIndentedString(businessrelationship)).append("\n");
    sb.append("    usecontacts: ").append(toIndentedString(usecontacts)).append("\n");
    sb.append("    busdivisionreq: ").append(toIndentedString(busdivisionreq)).append("\n");
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

