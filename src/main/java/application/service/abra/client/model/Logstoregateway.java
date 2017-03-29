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
 * Logstoregateway
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Logstoregateway   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Logstoregatewayrow> rows = new ArrayList<Logstoregatewayrow>();

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("forinput")
  private Boolean forinput = null;

  @SerializedName("foroutput")
  private Boolean foroutput = null;

  public Logstoregateway displayname(String displayname) {
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

  public Logstoregateway id(String id) {
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

  public Logstoregateway classid(String classid) {
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

  public Logstoregateway objversion(Integer objversion) {
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

  public Logstoregateway rows(List<Logstoregatewayrow> rows) {
    this.rows = rows;
    return this;
  }

  public Logstoregateway addRowsItem(Logstoregatewayrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo nasklad. a vysklad. místo - řádek [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo nasklad. a vysklad. místo - řádek [nepersistentní položka]")
  public List<Logstoregatewayrow> getRows() {
    return rows;
  }

  public void setRows(List<Logstoregatewayrow> rows) {
    this.rows = rows;
  }

  public Logstoregateway hidden(Boolean hidden) {
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

  public Logstoregateway code(String code) {
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

  public Logstoregateway name(String name) {
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

  public Logstoregateway forinput(Boolean forinput) {
    this.forinput = forinput;
    return this;
  }

   /**
   * pro naskladnění [persistentní položka]
   * @return forinput
  **/
  @ApiModelProperty(example = "null", value = "pro naskladnění [persistentní položka]")
  public Boolean getForinput() {
    return forinput;
  }

  public void setForinput(Boolean forinput) {
    this.forinput = forinput;
  }

  public Logstoregateway foroutput(Boolean foroutput) {
    this.foroutput = foroutput;
    return this;
  }

   /**
   * pro vyskladnění [persistentní položka]
   * @return foroutput
  **/
  @ApiModelProperty(example = "null", value = "pro vyskladnění [persistentní položka]")
  public Boolean getForoutput() {
    return foroutput;
  }

  public void setForoutput(Boolean foroutput) {
    this.foroutput = foroutput;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Logstoregateway logstoregateway = (Logstoregateway) o;
    return Objects.equals(this.displayname, logstoregateway.displayname) &&
        Objects.equals(this.id, logstoregateway.id) &&
        Objects.equals(this.classid, logstoregateway.classid) &&
        Objects.equals(this.objversion, logstoregateway.objversion) &&
        Objects.equals(this.rows, logstoregateway.rows) &&
        Objects.equals(this.hidden, logstoregateway.hidden) &&
        Objects.equals(this.code, logstoregateway.code) &&
        Objects.equals(this.name, logstoregateway.name) &&
        Objects.equals(this.forinput, logstoregateway.forinput) &&
        Objects.equals(this.foroutput, logstoregateway.foroutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, hidden, code, name, forinput, foroutput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Logstoregateway {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    forinput: ").append(toIndentedString(forinput)).append("\n");
    sb.append("    foroutput: ").append(toIndentedString(foroutput)).append("\n");
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

