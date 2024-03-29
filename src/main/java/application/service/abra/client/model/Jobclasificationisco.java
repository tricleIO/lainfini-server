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
 * Jobclasificationisco
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Jobclasificationisco   {
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

  @SerializedName("validdateto$date")
  private DateTime validdatetodate = null;

  @SerializedName("validdatefrom$date")
  private DateTime validdatefromdate = null;

  @SerializedName("successorcode")
  private String successorcode = null;

  public Jobclasificationisco displayname(String displayname) {
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

  public Jobclasificationisco id(String id) {
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

  public Jobclasificationisco classid(String classid) {
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

  public Jobclasificationisco objversion(Integer objversion) {
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

  public Jobclasificationisco hidden(Boolean hidden) {
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

  public Jobclasificationisco code(String code) {
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

  public Jobclasificationisco name(String name) {
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

  public Jobclasificationisco validdatetodate(DateTime validdatetodate) {
    this.validdatetodate = validdatetodate;
    return this;
  }

   /**
   * datum platnosti do [persistentní položka]
   * @return validdatetodate
  **/
  @ApiModelProperty(example = "null", value = "datum platnosti do [persistentní položka]")
  public DateTime getValiddatetodate() {
    return validdatetodate;
  }

  public void setValiddatetodate(DateTime validdatetodate) {
    this.validdatetodate = validdatetodate;
  }

  public Jobclasificationisco validdatefromdate(DateTime validdatefromdate) {
    this.validdatefromdate = validdatefromdate;
    return this;
  }

   /**
   * datum platnosti od [persistentní položka]
   * @return validdatefromdate
  **/
  @ApiModelProperty(example = "null", value = "datum platnosti od [persistentní položka]")
  public DateTime getValiddatefromdate() {
    return validdatefromdate;
  }

  public void setValiddatefromdate(DateTime validdatefromdate) {
    this.validdatefromdate = validdatefromdate;
  }

  public Jobclasificationisco successorcode(String successorcode) {
    this.successorcode = successorcode;
    return this;
  }

   /**
   * kód nástupce klasifikace zaměstnání [persistentní položka]
   * @return successorcode
  **/
  @ApiModelProperty(example = "null", value = "kód nástupce klasifikace zaměstnání [persistentní položka]")
  public String getSuccessorcode() {
    return successorcode;
  }

  public void setSuccessorcode(String successorcode) {
    this.successorcode = successorcode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Jobclasificationisco jobclasificationisco = (Jobclasificationisco) o;
    return Objects.equals(this.displayname, jobclasificationisco.displayname) &&
        Objects.equals(this.id, jobclasificationisco.id) &&
        Objects.equals(this.classid, jobclasificationisco.classid) &&
        Objects.equals(this.objversion, jobclasificationisco.objversion) &&
        Objects.equals(this.hidden, jobclasificationisco.hidden) &&
        Objects.equals(this.code, jobclasificationisco.code) &&
        Objects.equals(this.name, jobclasificationisco.name) &&
        Objects.equals(this.validdatetodate, jobclasificationisco.validdatetodate) &&
        Objects.equals(this.validdatefromdate, jobclasificationisco.validdatefromdate) &&
        Objects.equals(this.successorcode, jobclasificationisco.successorcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, code, name, validdatetodate, validdatefromdate, successorcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jobclasificationisco {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validdatetodate: ").append(toIndentedString(validdatetodate)).append("\n");
    sb.append("    validdatefromdate: ").append(toIndentedString(validdatefromdate)).append("\n");
    sb.append("    successorcode: ").append(toIndentedString(successorcode)).append("\n");
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

