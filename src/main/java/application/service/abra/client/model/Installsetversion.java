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
 * Installsetversion
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Installsetversion   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("versionauthor")
  private String versionauthor = null;

  @SerializedName("versiondate$date")
  private DateTime versiondatedate = null;

  @SerializedName("versiondescription")
  private String versiondescription = null;

  @SerializedName("versionitems")
  private List<Installsetversion> versionitems = new ArrayList<Installsetversion>();

  public Installsetversion displayname(String displayname) {
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

  public Installsetversion id(String id) {
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

  public Installsetversion classid(String classid) {
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

  public Installsetversion objversion(Integer objversion) {
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

  public Installsetversion parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu instalační sada [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu instalační sada [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Installsetversion version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Číslo verze [persistentní položka]
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "Číslo verze [persistentní položka]")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Installsetversion versionauthor(String versionauthor) {
    this.versionauthor = versionauthor;
    return this;
  }

   /**
   * autor verze [persistentní položka]
   * @return versionauthor
  **/
  @ApiModelProperty(example = "null", value = "autor verze [persistentní položka]")
  public String getVersionauthor() {
    return versionauthor;
  }

  public void setVersionauthor(String versionauthor) {
    this.versionauthor = versionauthor;
  }

  public Installsetversion versiondatedate(DateTime versiondatedate) {
    this.versiondatedate = versiondatedate;
    return this;
  }

   /**
   * datum verze [persistentní položka]
   * @return versiondatedate
  **/
  @ApiModelProperty(example = "null", value = "datum verze [persistentní položka]")
  public DateTime getVersiondatedate() {
    return versiondatedate;
  }

  public void setVersiondatedate(DateTime versiondatedate) {
    this.versiondatedate = versiondatedate;
  }

  public Installsetversion versiondescription(String versiondescription) {
    this.versiondescription = versiondescription;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return versiondescription
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getVersiondescription() {
    return versiondescription;
  }

  public void setVersiondescription(String versiondescription) {
    this.versiondescription = versiondescription;
  }

  public Installsetversion versionitems(List<Installsetversion> versionitems) {
    this.versionitems = versionitems;
    return this;
  }

  public Installsetversion addVersionitemsItem(Installsetversion versionitemsItem) {
    this.versionitems.add(versionitemsItem);
    return this;
  }

   /**
   * položka instalační sady ve verzi; kolekce bo verze instalační sady [nepersistentní položka]
   * @return versionitems
  **/
  @ApiModelProperty(example = "null", value = "položka instalační sady ve verzi; kolekce bo verze instalační sady [nepersistentní položka]")
  public List<Installsetversion> getVersionitems() {
    return versionitems;
  }

  public void setVersionitems(List<Installsetversion> versionitems) {
    this.versionitems = versionitems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installsetversion installsetversion = (Installsetversion) o;
    return Objects.equals(this.displayname, installsetversion.displayname) &&
        Objects.equals(this.id, installsetversion.id) &&
        Objects.equals(this.classid, installsetversion.classid) &&
        Objects.equals(this.objversion, installsetversion.objversion) &&
        Objects.equals(this.parentId, installsetversion.parentId) &&
        Objects.equals(this.version, installsetversion.version) &&
        Objects.equals(this.versionauthor, installsetversion.versionauthor) &&
        Objects.equals(this.versiondatedate, installsetversion.versiondatedate) &&
        Objects.equals(this.versiondescription, installsetversion.versiondescription) &&
        Objects.equals(this.versionitems, installsetversion.versionitems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, version, versionauthor, versiondatedate, versiondescription, versionitems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installsetversion {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionauthor: ").append(toIndentedString(versionauthor)).append("\n");
    sb.append("    versiondatedate: ").append(toIndentedString(versiondatedate)).append("\n");
    sb.append("    versiondescription: ").append(toIndentedString(versiondescription)).append("\n");
    sb.append("    versionitems: ").append(toIndentedString(versionitems)).append("\n");
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

