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
 * Crmcampaignblacklist
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Crmcampaignblacklist   {
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

  @SerializedName("firm_id")
  private String firmId = null;

  @SerializedName("person_id")
  private String personId = null;

  @SerializedName("firmoffice_id")
  private String firmofficeId = null;

  @SerializedName("prohibitiondate$date")
  private DateTime prohibitiondatedate = null;

  @SerializedName("email")
  private Boolean email = null;

  @SerializedName("emailaddress")
  private String emailaddress = null;

  @SerializedName("post")
  private Boolean post = null;

  @SerializedName("personal")
  private Boolean personal = null;

  @SerializedName("phone")
  private Boolean phone = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  public Crmcampaignblacklist displayname(String displayname) {
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

  public Crmcampaignblacklist id(String id) {
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

  public Crmcampaignblacklist classid(String classid) {
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

  public Crmcampaignblacklist objversion(Integer objversion) {
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

  public Crmcampaignblacklist hidden(Boolean hidden) {
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

  public Crmcampaignblacklist firmId(String firmId) {
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

  public Crmcampaignblacklist personId(String personId) {
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

  public Crmcampaignblacklist firmofficeId(String firmofficeId) {
    this.firmofficeId = firmofficeId;
    return this;
  }

   /**
   * provozovna; id objektu provozovna [persistentní položka]
   * @return firmofficeId
  **/
  @ApiModelProperty(example = "null", value = "provozovna; id objektu provozovna [persistentní položka]")
  public String getFirmofficeId() {
    return firmofficeId;
  }

  public void setFirmofficeId(String firmofficeId) {
    this.firmofficeId = firmofficeId;
  }

  public Crmcampaignblacklist prohibitiondatedate(DateTime prohibitiondatedate) {
    this.prohibitiondatedate = prohibitiondatedate;
    return this;
  }

   /**
   * datum zakázání [persistentní položka]
   * @return prohibitiondatedate
  **/
  @ApiModelProperty(example = "null", value = "datum zakázání [persistentní položka]")
  public DateTime getProhibitiondatedate() {
    return prohibitiondatedate;
  }

  public void setProhibitiondatedate(DateTime prohibitiondatedate) {
    this.prohibitiondatedate = prohibitiondatedate;
  }

  public Crmcampaignblacklist email(Boolean email) {
    this.email = email;
    return this;
  }

   /**
   * e-mailem [persistentní položka]
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "e-mailem [persistentní položka]")
  public Boolean getEmail() {
    return email;
  }

  public void setEmail(Boolean email) {
    this.email = email;
  }

  public Crmcampaignblacklist emailaddress(String emailaddress) {
    this.emailaddress = emailaddress;
    return this;
  }

   /**
   * adresa e-mailu [persistentní položka]
   * @return emailaddress
  **/
  @ApiModelProperty(example = "null", value = "adresa e-mailu [persistentní položka]")
  public String getEmailaddress() {
    return emailaddress;
  }

  public void setEmailaddress(String emailaddress) {
    this.emailaddress = emailaddress;
  }

  public Crmcampaignblacklist post(Boolean post) {
    this.post = post;
    return this;
  }

   /**
   * poštou [persistentní položka]
   * @return post
  **/
  @ApiModelProperty(example = "null", value = "poštou [persistentní položka]")
  public Boolean getPost() {
    return post;
  }

  public void setPost(Boolean post) {
    this.post = post;
  }

  public Crmcampaignblacklist personal(Boolean personal) {
    this.personal = personal;
    return this;
  }

   /**
   * osobně [persistentní položka]
   * @return personal
  **/
  @ApiModelProperty(example = "null", value = "osobně [persistentní položka]")
  public Boolean getPersonal() {
    return personal;
  }

  public void setPersonal(Boolean personal) {
    this.personal = personal;
  }

  public Crmcampaignblacklist phone(Boolean phone) {
    this.phone = phone;
    return this;
  }

   /**
   * telefonicky [persistentní položka]
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "telefonicky [persistentní položka]")
  public Boolean getPhone() {
    return phone;
  }

  public void setPhone(Boolean phone) {
    this.phone = phone;
  }

  public Crmcampaignblacklist divisionId(String divisionId) {
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

  public Crmcampaignblacklist busorderId(String busorderId) {
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

  public Crmcampaignblacklist bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * obch. případ; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "obch. případ; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Crmcampaignblacklist busprojectId(String busprojectId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Crmcampaignblacklist crmcampaignblacklist = (Crmcampaignblacklist) o;
    return Objects.equals(this.displayname, crmcampaignblacklist.displayname) &&
        Objects.equals(this.id, crmcampaignblacklist.id) &&
        Objects.equals(this.classid, crmcampaignblacklist.classid) &&
        Objects.equals(this.objversion, crmcampaignblacklist.objversion) &&
        Objects.equals(this.hidden, crmcampaignblacklist.hidden) &&
        Objects.equals(this.firmId, crmcampaignblacklist.firmId) &&
        Objects.equals(this.personId, crmcampaignblacklist.personId) &&
        Objects.equals(this.firmofficeId, crmcampaignblacklist.firmofficeId) &&
        Objects.equals(this.prohibitiondatedate, crmcampaignblacklist.prohibitiondatedate) &&
        Objects.equals(this.email, crmcampaignblacklist.email) &&
        Objects.equals(this.emailaddress, crmcampaignblacklist.emailaddress) &&
        Objects.equals(this.post, crmcampaignblacklist.post) &&
        Objects.equals(this.personal, crmcampaignblacklist.personal) &&
        Objects.equals(this.phone, crmcampaignblacklist.phone) &&
        Objects.equals(this.divisionId, crmcampaignblacklist.divisionId) &&
        Objects.equals(this.busorderId, crmcampaignblacklist.busorderId) &&
        Objects.equals(this.bustransactionId, crmcampaignblacklist.bustransactionId) &&
        Objects.equals(this.busprojectId, crmcampaignblacklist.busprojectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, firmId, personId, firmofficeId, prohibitiondatedate, email, emailaddress, post, personal, phone, divisionId, busorderId, bustransactionId, busprojectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Crmcampaignblacklist {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    firmId: ").append(toIndentedString(firmId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    firmofficeId: ").append(toIndentedString(firmofficeId)).append("\n");
    sb.append("    prohibitiondatedate: ").append(toIndentedString(prohibitiondatedate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailaddress: ").append(toIndentedString(emailaddress)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    personal: ").append(toIndentedString(personal)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

