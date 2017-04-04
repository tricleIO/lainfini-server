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
 * Wageimportssickbenefit
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Wageimportssickbenefit   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("externalcreator")
  private String externalcreator = null;

  @SerializedName("informationaltext")
  private String informationaltext = null;

  @SerializedName("importdate$date")
  private DateTime importdatedate = null;

  public Wageimportssickbenefit displayname(String displayname) {
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

  public Wageimportssickbenefit id(String id) {
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

  public Wageimportssickbenefit classid(String classid) {
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

  public Wageimportssickbenefit objversion(Integer objversion) {
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

  public Wageimportssickbenefit externalcreator(String externalcreator) {
    this.externalcreator = externalcreator;
    return this;
  }

   /**
   * zdroj importu [persistentní položka]
   * @return externalcreator
  **/
  @ApiModelProperty(example = "null", value = "zdroj importu [persistentní položka]")
  public String getExternalcreator() {
    return externalcreator;
  }

  public void setExternalcreator(String externalcreator) {
    this.externalcreator = externalcreator;
  }

  public Wageimportssickbenefit informationaltext(String informationaltext) {
    this.informationaltext = informationaltext;
    return this;
  }

   /**
   * informace [persistentní položka]
   * @return informationaltext
  **/
  @ApiModelProperty(example = "null", value = "informace [persistentní položka]")
  public String getInformationaltext() {
    return informationaltext;
  }

  public void setInformationaltext(String informationaltext) {
    this.informationaltext = informationaltext;
  }

  public Wageimportssickbenefit importdatedate(DateTime importdatedate) {
    this.importdatedate = importdatedate;
    return this;
  }

   /**
   * datum importu [persistentní položka]
   * @return importdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum importu [persistentní položka]")
  public DateTime getImportdatedate() {
    return importdatedate;
  }

  public void setImportdatedate(DateTime importdatedate) {
    this.importdatedate = importdatedate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wageimportssickbenefit wageimportssickbenefit = (Wageimportssickbenefit) o;
    return Objects.equals(this.displayname, wageimportssickbenefit.displayname) &&
        Objects.equals(this.id, wageimportssickbenefit.id) &&
        Objects.equals(this.classid, wageimportssickbenefit.classid) &&
        Objects.equals(this.objversion, wageimportssickbenefit.objversion) &&
        Objects.equals(this.externalcreator, wageimportssickbenefit.externalcreator) &&
        Objects.equals(this.informationaltext, wageimportssickbenefit.informationaltext) &&
        Objects.equals(this.importdatedate, wageimportssickbenefit.importdatedate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, externalcreator, informationaltext, importdatedate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wageimportssickbenefit {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    externalcreator: ").append(toIndentedString(externalcreator)).append("\n");
    sb.append("    informationaltext: ").append(toIndentedString(informationaltext)).append("\n");
    sb.append("    importdatedate: ").append(toIndentedString(importdatedate)).append("\n");
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
