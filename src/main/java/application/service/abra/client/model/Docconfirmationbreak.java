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
 * Docconfirmationbreak
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Docconfirmationbreak   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("doctype")
  private String doctype = null;

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("caneditconfirmeddoc")
  private Boolean caneditconfirmeddoc = null;

  @SerializedName("caneditrefuseddoc")
  private Boolean caneditrefuseddoc = null;

  @SerializedName("usedecisivefields")
  private Boolean usedecisivefields = null;

  @SerializedName("decisivefields")
  private List<Docconfbreakdecisivefield> decisivefields = new ArrayList<Docconfbreakdecisivefield>();

  @SerializedName("kinddecisivefields")
  private Integer kinddecisivefields = null;

  public Docconfirmationbreak displayname(String displayname) {
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

  public Docconfirmationbreak id(String id) {
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

  public Docconfirmationbreak classid(String classid) {
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

  public Docconfirmationbreak objversion(Integer objversion) {
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

  public Docconfirmationbreak doctype(String doctype) {
    this.doctype = doctype;
    return this;
  }

   /**
   * typ dokladu [persistentní položka]
   * @return doctype
  **/
  @ApiModelProperty(example = "null", value = "typ dokladu [persistentní položka]")
  public String getDoctype() {
    return doctype;
  }

  public void setDoctype(String doctype) {
    this.doctype = doctype;
  }

  public Docconfirmationbreak docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * Řada dokladů; id objektu Řada dokladů [persistentní položka]
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "Řada dokladů; id objektu Řada dokladů [persistentní položka]")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Docconfirmationbreak createdbyId(String createdbyId) {
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

  public Docconfirmationbreak correctedbyId(String correctedbyId) {
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

  public Docconfirmationbreak caneditconfirmeddoc(Boolean caneditconfirmeddoc) {
    this.caneditconfirmeddoc = caneditconfirmeddoc;
    return this;
  }

   /**
   * povoleno pro schválený [persistentní položka]
   * @return caneditconfirmeddoc
  **/
  @ApiModelProperty(example = "null", value = "povoleno pro schválený [persistentní položka]")
  public Boolean getCaneditconfirmeddoc() {
    return caneditconfirmeddoc;
  }

  public void setCaneditconfirmeddoc(Boolean caneditconfirmeddoc) {
    this.caneditconfirmeddoc = caneditconfirmeddoc;
  }

  public Docconfirmationbreak caneditrefuseddoc(Boolean caneditrefuseddoc) {
    this.caneditrefuseddoc = caneditrefuseddoc;
    return this;
  }

   /**
   * povoleno pro zamítnutý [persistentní položka]
   * @return caneditrefuseddoc
  **/
  @ApiModelProperty(example = "null", value = "povoleno pro zamítnutý [persistentní položka]")
  public Boolean getCaneditrefuseddoc() {
    return caneditrefuseddoc;
  }

  public void setCaneditrefuseddoc(Boolean caneditrefuseddoc) {
    this.caneditrefuseddoc = caneditrefuseddoc;
  }

  public Docconfirmationbreak usedecisivefields(Boolean usedecisivefields) {
    this.usedecisivefields = usedecisivefields;
    return this;
  }

   /**
   * používat rozhodné položky [persistentní položka]
   * @return usedecisivefields
  **/
  @ApiModelProperty(example = "null", value = "používat rozhodné položky [persistentní položka]")
  public Boolean getUsedecisivefields() {
    return usedecisivefields;
  }

  public void setUsedecisivefields(Boolean usedecisivefields) {
    this.usedecisivefields = usedecisivefields;
  }

  public Docconfirmationbreak decisivefields(List<Docconfbreakdecisivefield> decisivefields) {
    this.decisivefields = decisivefields;
    return this;
  }

  public Docconfirmationbreak addDecisivefieldsItem(Docconfbreakdecisivefield decisivefieldsItem) {
    this.decisivefields.add(decisivefieldsItem);
    return this;
  }

   /**
   * rozhodné položky; kolekce bo povolení oprav - rozhodné položky pro schválení při opravě [nepersistentní položka]
   * @return decisivefields
  **/
  @ApiModelProperty(example = "null", value = "rozhodné položky; kolekce bo povolení oprav - rozhodné položky pro schválení při opravě [nepersistentní položka]")
  public List<Docconfbreakdecisivefield> getDecisivefields() {
    return decisivefields;
  }

  public void setDecisivefields(List<Docconfbreakdecisivefield> decisivefields) {
    this.decisivefields = decisivefields;
  }

  public Docconfirmationbreak kinddecisivefields(Integer kinddecisivefields) {
    this.kinddecisivefields = kinddecisivefields;
    return this;
  }

   /**
   * druh rozhodných položek [persistentní položka]
   * @return kinddecisivefields
  **/
  @ApiModelProperty(example = "null", value = "druh rozhodných položek [persistentní položka]")
  public Integer getKinddecisivefields() {
    return kinddecisivefields;
  }

  public void setKinddecisivefields(Integer kinddecisivefields) {
    this.kinddecisivefields = kinddecisivefields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Docconfirmationbreak docconfirmationbreak = (Docconfirmationbreak) o;
    return Objects.equals(this.displayname, docconfirmationbreak.displayname) &&
        Objects.equals(this.id, docconfirmationbreak.id) &&
        Objects.equals(this.classid, docconfirmationbreak.classid) &&
        Objects.equals(this.objversion, docconfirmationbreak.objversion) &&
        Objects.equals(this.doctype, docconfirmationbreak.doctype) &&
        Objects.equals(this.docqueueId, docconfirmationbreak.docqueueId) &&
        Objects.equals(this.createdbyId, docconfirmationbreak.createdbyId) &&
        Objects.equals(this.correctedbyId, docconfirmationbreak.correctedbyId) &&
        Objects.equals(this.caneditconfirmeddoc, docconfirmationbreak.caneditconfirmeddoc) &&
        Objects.equals(this.caneditrefuseddoc, docconfirmationbreak.caneditrefuseddoc) &&
        Objects.equals(this.usedecisivefields, docconfirmationbreak.usedecisivefields) &&
        Objects.equals(this.decisivefields, docconfirmationbreak.decisivefields) &&
        Objects.equals(this.kinddecisivefields, docconfirmationbreak.kinddecisivefields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, doctype, docqueueId, createdbyId, correctedbyId, caneditconfirmeddoc, caneditrefuseddoc, usedecisivefields, decisivefields, kinddecisivefields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Docconfirmationbreak {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    doctype: ").append(toIndentedString(doctype)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    caneditconfirmeddoc: ").append(toIndentedString(caneditconfirmeddoc)).append("\n");
    sb.append("    caneditrefuseddoc: ").append(toIndentedString(caneditrefuseddoc)).append("\n");
    sb.append("    usedecisivefields: ").append(toIndentedString(usedecisivefields)).append("\n");
    sb.append("    decisivefields: ").append(toIndentedString(decisivefields)).append("\n");
    sb.append("    kinddecisivefields: ").append(toIndentedString(kinddecisivefields)).append("\n");
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

