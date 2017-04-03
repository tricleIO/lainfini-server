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
 * Emailprocessingrule
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Emailprocessingrule   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("posindex")
  private Integer posindex = null;

  @SerializedName("goon")
  private Boolean goon = null;

  @SerializedName("ruleactions")
  private List<Emailprocessingruleaction> ruleactions = new ArrayList<Emailprocessingruleaction>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("emailaccount_id")
  private String emailaccountId = null;

  @SerializedName("filenamemask")
  private String filenamemask = null;

  @SerializedName("filenamemaskisregex")
  private Boolean filenamemaskisregex = null;

  @SerializedName("sendermask")
  private String sendermask = null;

  @SerializedName("sendermaskisregex")
  private Boolean sendermaskisregex = null;

  @SerializedName("sendtomask")
  private String sendtomask = null;

  @SerializedName("sendtomaskisregex")
  private Boolean sendtomaskisregex = null;

  @SerializedName("subjectmask")
  private String subjectmask = null;

  @SerializedName("subjectmaskisregex")
  private Boolean subjectmaskisregex = null;

  @SerializedName("emailcondition")
  private String emailcondition = null;

  @SerializedName("isforemail")
  private Boolean isforemail = null;

  @SerializedName("isforattachment")
  private Boolean isforattachment = null;

  public Emailprocessingrule displayname(String displayname) {
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

  public Emailprocessingrule id(String id) {
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

  public Emailprocessingrule classid(String classid) {
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

  public Emailprocessingrule objversion(Integer objversion) {
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

  public Emailprocessingrule posindex(Integer posindex) {
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

  public Emailprocessingrule goon(Boolean goon) {
    this.goon = goon;
    return this;
  }

   /**
   * pokračovat [persistentní položka]
   * @return goon
  **/
  @ApiModelProperty(example = "null", value = "pokračovat [persistentní položka]")
  public Boolean getGoon() {
    return goon;
  }

  public void setGoon(Boolean goon) {
    this.goon = goon;
  }

  public Emailprocessingrule ruleactions(List<Emailprocessingruleaction> ruleactions) {
    this.ruleactions = ruleactions;
    return this;
  }

  public Emailprocessingrule addRuleactionsItem(Emailprocessingruleaction ruleactionsItem) {
    this.ruleactions.add(ruleactionsItem);
    return this;
  }

   /**
   * akce; kolekce bo akce pravidla pro zpracování doručené e-mail. pošty [nepersistentní položka]
   * @return ruleactions
  **/
  @ApiModelProperty(example = "null", value = "akce; kolekce bo akce pravidla pro zpracování doručené e-mail. pošty [nepersistentní položka]")
  public List<Emailprocessingruleaction> getRuleactions() {
    return ruleactions;
  }

  public void setRuleactions(List<Emailprocessingruleaction> ruleactions) {
    this.ruleactions = ruleactions;
  }

  public Emailprocessingrule description(String description) {
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

  public Emailprocessingrule emailaccountId(String emailaccountId) {
    this.emailaccountId = emailaccountId;
    return this;
  }

   /**
   * e-mailový účet; id objektu e-mailový účet [persistentní položka]
   * @return emailaccountId
  **/
  @ApiModelProperty(example = "null", value = "e-mailový účet; id objektu e-mailový účet [persistentní položka]")
  public String getEmailaccountId() {
    return emailaccountId;
  }

  public void setEmailaccountId(String emailaccountId) {
    this.emailaccountId = emailaccountId;
  }

  public Emailprocessingrule filenamemask(String filenamemask) {
    this.filenamemask = filenamemask;
    return this;
  }

   /**
   * maska pro název přílohy [persistentní položka]
   * @return filenamemask
  **/
  @ApiModelProperty(example = "null", value = "maska pro název přílohy [persistentní položka]")
  public String getFilenamemask() {
    return filenamemask;
  }

  public void setFilenamemask(String filenamemask) {
    this.filenamemask = filenamemask;
  }

  public Emailprocessingrule filenamemaskisregex(Boolean filenamemaskisregex) {
    this.filenamemaskisregex = filenamemaskisregex;
    return this;
  }

   /**
   * maska pro název přílohy je regulární výraz [persistentní položka]
   * @return filenamemaskisregex
  **/
  @ApiModelProperty(example = "null", value = "maska pro název přílohy je regulární výraz [persistentní položka]")
  public Boolean getFilenamemaskisregex() {
    return filenamemaskisregex;
  }

  public void setFilenamemaskisregex(Boolean filenamemaskisregex) {
    this.filenamemaskisregex = filenamemaskisregex;
  }

  public Emailprocessingrule sendermask(String sendermask) {
    this.sendermask = sendermask;
    return this;
  }

   /**
   * maska pro odesílatele [persistentní položka]
   * @return sendermask
  **/
  @ApiModelProperty(example = "null", value = "maska pro odesílatele [persistentní položka]")
  public String getSendermask() {
    return sendermask;
  }

  public void setSendermask(String sendermask) {
    this.sendermask = sendermask;
  }

  public Emailprocessingrule sendermaskisregex(Boolean sendermaskisregex) {
    this.sendermaskisregex = sendermaskisregex;
    return this;
  }

   /**
   * maska pro odesílatele je regulární výraz [persistentní položka]
   * @return sendermaskisregex
  **/
  @ApiModelProperty(example = "null", value = "maska pro odesílatele je regulární výraz [persistentní položka]")
  public Boolean getSendermaskisregex() {
    return sendermaskisregex;
  }

  public void setSendermaskisregex(Boolean sendermaskisregex) {
    this.sendermaskisregex = sendermaskisregex;
  }

  public Emailprocessingrule sendtomask(String sendtomask) {
    this.sendtomask = sendtomask;
    return this;
  }

   /**
   * maska pro příjemce [persistentní položka]
   * @return sendtomask
  **/
  @ApiModelProperty(example = "null", value = "maska pro příjemce [persistentní položka]")
  public String getSendtomask() {
    return sendtomask;
  }

  public void setSendtomask(String sendtomask) {
    this.sendtomask = sendtomask;
  }

  public Emailprocessingrule sendtomaskisregex(Boolean sendtomaskisregex) {
    this.sendtomaskisregex = sendtomaskisregex;
    return this;
  }

   /**
   * maska pro příjemce je regulární výraz [persistentní položka]
   * @return sendtomaskisregex
  **/
  @ApiModelProperty(example = "null", value = "maska pro příjemce je regulární výraz [persistentní položka]")
  public Boolean getSendtomaskisregex() {
    return sendtomaskisregex;
  }

  public void setSendtomaskisregex(Boolean sendtomaskisregex) {
    this.sendtomaskisregex = sendtomaskisregex;
  }

  public Emailprocessingrule subjectmask(String subjectmask) {
    this.subjectmask = subjectmask;
    return this;
  }

   /**
   * maska pro předmět [persistentní položka]
   * @return subjectmask
  **/
  @ApiModelProperty(example = "null", value = "maska pro předmět [persistentní položka]")
  public String getSubjectmask() {
    return subjectmask;
  }

  public void setSubjectmask(String subjectmask) {
    this.subjectmask = subjectmask;
  }

  public Emailprocessingrule subjectmaskisregex(Boolean subjectmaskisregex) {
    this.subjectmaskisregex = subjectmaskisregex;
    return this;
  }

   /**
   * maska pro předmět je regulární výraz [persistentní položka]
   * @return subjectmaskisregex
  **/
  @ApiModelProperty(example = "null", value = "maska pro předmět je regulární výraz [persistentní položka]")
  public Boolean getSubjectmaskisregex() {
    return subjectmaskisregex;
  }

  public void setSubjectmaskisregex(Boolean subjectmaskisregex) {
    this.subjectmaskisregex = subjectmaskisregex;
  }

  public Emailprocessingrule emailcondition(String emailcondition) {
    this.emailcondition = emailcondition;
    return this;
  }

   /**
   * podmínka [persistentní položka]
   * @return emailcondition
  **/
  @ApiModelProperty(example = "null", value = "podmínka [persistentní položka]")
  public String getEmailcondition() {
    return emailcondition;
  }

  public void setEmailcondition(String emailcondition) {
    this.emailcondition = emailcondition;
  }

  public Emailprocessingrule isforemail(Boolean isforemail) {
    this.isforemail = isforemail;
    return this;
  }

   /**
   * pro e-mail [persistentní položka]
   * @return isforemail
  **/
  @ApiModelProperty(example = "null", value = "pro e-mail [persistentní položka]")
  public Boolean getIsforemail() {
    return isforemail;
  }

  public void setIsforemail(Boolean isforemail) {
    this.isforemail = isforemail;
  }

  public Emailprocessingrule isforattachment(Boolean isforattachment) {
    this.isforattachment = isforattachment;
    return this;
  }

   /**
   * pro přílohu [persistentní položka]
   * @return isforattachment
  **/
  @ApiModelProperty(example = "null", value = "pro přílohu [persistentní položka]")
  public Boolean getIsforattachment() {
    return isforattachment;
  }

  public void setIsforattachment(Boolean isforattachment) {
    this.isforattachment = isforattachment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emailprocessingrule emailprocessingrule = (Emailprocessingrule) o;
    return Objects.equals(this.displayname, emailprocessingrule.displayname) &&
        Objects.equals(this.id, emailprocessingrule.id) &&
        Objects.equals(this.classid, emailprocessingrule.classid) &&
        Objects.equals(this.objversion, emailprocessingrule.objversion) &&
        Objects.equals(this.posindex, emailprocessingrule.posindex) &&
        Objects.equals(this.goon, emailprocessingrule.goon) &&
        Objects.equals(this.ruleactions, emailprocessingrule.ruleactions) &&
        Objects.equals(this.description, emailprocessingrule.description) &&
        Objects.equals(this.emailaccountId, emailprocessingrule.emailaccountId) &&
        Objects.equals(this.filenamemask, emailprocessingrule.filenamemask) &&
        Objects.equals(this.filenamemaskisregex, emailprocessingrule.filenamemaskisregex) &&
        Objects.equals(this.sendermask, emailprocessingrule.sendermask) &&
        Objects.equals(this.sendermaskisregex, emailprocessingrule.sendermaskisregex) &&
        Objects.equals(this.sendtomask, emailprocessingrule.sendtomask) &&
        Objects.equals(this.sendtomaskisregex, emailprocessingrule.sendtomaskisregex) &&
        Objects.equals(this.subjectmask, emailprocessingrule.subjectmask) &&
        Objects.equals(this.subjectmaskisregex, emailprocessingrule.subjectmaskisregex) &&
        Objects.equals(this.emailcondition, emailprocessingrule.emailcondition) &&
        Objects.equals(this.isforemail, emailprocessingrule.isforemail) &&
        Objects.equals(this.isforattachment, emailprocessingrule.isforattachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, posindex, goon, ruleactions, description, emailaccountId, filenamemask, filenamemaskisregex, sendermask, sendermaskisregex, sendtomask, sendtomaskisregex, subjectmask, subjectmaskisregex, emailcondition, isforemail, isforattachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emailprocessingrule {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    goon: ").append(toIndentedString(goon)).append("\n");
    sb.append("    ruleactions: ").append(toIndentedString(ruleactions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    emailaccountId: ").append(toIndentedString(emailaccountId)).append("\n");
    sb.append("    filenamemask: ").append(toIndentedString(filenamemask)).append("\n");
    sb.append("    filenamemaskisregex: ").append(toIndentedString(filenamemaskisregex)).append("\n");
    sb.append("    sendermask: ").append(toIndentedString(sendermask)).append("\n");
    sb.append("    sendermaskisregex: ").append(toIndentedString(sendermaskisregex)).append("\n");
    sb.append("    sendtomask: ").append(toIndentedString(sendtomask)).append("\n");
    sb.append("    sendtomaskisregex: ").append(toIndentedString(sendtomaskisregex)).append("\n");
    sb.append("    subjectmask: ").append(toIndentedString(subjectmask)).append("\n");
    sb.append("    subjectmaskisregex: ").append(toIndentedString(subjectmaskisregex)).append("\n");
    sb.append("    emailcondition: ").append(toIndentedString(emailcondition)).append("\n");
    sb.append("    isforemail: ").append(toIndentedString(isforemail)).append("\n");
    sb.append("    isforattachment: ").append(toIndentedString(isforattachment)).append("\n");
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

