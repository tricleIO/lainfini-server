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
 * Useremailhistory
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Useremailhistory   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("date$date")
  private DateTime datedate = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("email")
  private String email = null;

  public Useremailhistory displayname(String displayname) {
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

  public Useremailhistory id(String id) {
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

  public Useremailhistory classid(String classid) {
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

  public Useremailhistory objversion(Integer objversion) {
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

  public Useremailhistory datedate(DateTime datedate) {
    this.datedate = datedate;
    return this;
  }

   /**
   * datum použití [persistentní položka]
   * @return datedate
  **/
  @ApiModelProperty(example = "null", value = "datum použití [persistentní položka]")
  public DateTime getDatedate() {
    return datedate;
  }

  public void setDatedate(DateTime datedate) {
    this.datedate = datedate;
  }

  public Useremailhistory userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * osoba; id objektu uživatel [persistentní položka]
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "osoba; id objektu uživatel [persistentní položka]")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Useremailhistory email(String email) {
    this.email = email;
    return this;
  }

   /**
   * e-mail [persistentní položka]
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "e-mail [persistentní položka]")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Useremailhistory useremailhistory = (Useremailhistory) o;
    return Objects.equals(this.displayname, useremailhistory.displayname) &&
        Objects.equals(this.id, useremailhistory.id) &&
        Objects.equals(this.classid, useremailhistory.classid) &&
        Objects.equals(this.objversion, useremailhistory.objversion) &&
        Objects.equals(this.datedate, useremailhistory.datedate) &&
        Objects.equals(this.userId, useremailhistory.userId) &&
        Objects.equals(this.email, useremailhistory.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, datedate, userId, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Useremailhistory {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    datedate: ").append(toIndentedString(datedate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
