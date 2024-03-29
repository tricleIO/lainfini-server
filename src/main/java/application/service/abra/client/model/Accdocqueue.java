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
 * Accdocqueue
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Accdocqueue   {
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

  @SerializedName("lastnumbers")
  private List<Accdocqueueperiod> lastnumbers = new ArrayList<Accdocqueueperiod>();

  @SerializedName("note")
  private String note = null;

  @SerializedName("documenttype")
  private String documenttype = null;

  @SerializedName("accountwhere")
  private Boolean accountwhere = null;

  @SerializedName("summaryaccounted")
  private Boolean summaryaccounted = null;

  @SerializedName("reverseaccounting")
  private Boolean reverseaccounting = null;

  @SerializedName("reversedepositaccounting")
  private Boolean reversedepositaccounting = null;

  public Accdocqueue displayname(String displayname) {
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

  public Accdocqueue id(String id) {
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

  public Accdocqueue classid(String classid) {
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

  public Accdocqueue objversion(Integer objversion) {
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

  public Accdocqueue hidden(Boolean hidden) {
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

  public Accdocqueue code(String code) {
    this.code = code;
    return this;
  }

   /**
   * zkratka [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "zkratka [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Accdocqueue name(String name) {
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

  public Accdocqueue lastnumbers(List<Accdocqueueperiod> lastnumbers) {
    this.lastnumbers = lastnumbers;
    return this;
  }

  public Accdocqueue addLastnumbersItem(Accdocqueueperiod lastnumbersItem) {
    this.lastnumbers.add(lastnumbersItem);
    return this;
  }

   /**
   * Čísla; kolekce bo Účetní řada dokladů - období [nepersistentní položka]
   * @return lastnumbers
  **/
  @ApiModelProperty(example = "null", value = "Čísla; kolekce bo Účetní řada dokladů - období [nepersistentní položka]")
  public List<Accdocqueueperiod> getLastnumbers() {
    return lastnumbers;
  }

  public void setLastnumbers(List<Accdocqueueperiod> lastnumbers) {
    this.lastnumbers = lastnumbers;
  }

  public Accdocqueue note(String note) {
    this.note = note;
    return this;
  }

   /**
   * poznámka [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "poznámka [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Accdocqueue documenttype(String documenttype) {
    this.documenttype = documenttype;
    return this;
  }

   /**
   * typ dokladu [persistentní položka]
   * @return documenttype
  **/
  @ApiModelProperty(example = "null", value = "typ dokladu [persistentní položka]")
  public String getDocumenttype() {
    return documenttype;
  }

  public void setDocumenttype(String documenttype) {
    this.documenttype = documenttype;
  }

  public Accdocqueue accountwhere(Boolean accountwhere) {
    this.accountwhere = accountwhere;
    return this;
  }

   /**
   * Účtovat [persistentní položka]
   * @return accountwhere
  **/
  @ApiModelProperty(example = "null", value = "Účtovat [persistentní položka]")
  public Boolean getAccountwhere() {
    return accountwhere;
  }

  public void setAccountwhere(Boolean accountwhere) {
    this.accountwhere = accountwhere;
  }

  public Accdocqueue summaryaccounted(Boolean summaryaccounted) {
    this.summaryaccounted = summaryaccounted;
    return this;
  }

   /**
   * souhrnně [persistentní položka]
   * @return summaryaccounted
  **/
  @ApiModelProperty(example = "null", value = "souhrnně [persistentní položka]")
  public Boolean getSummaryaccounted() {
    return summaryaccounted;
  }

  public void setSummaryaccounted(Boolean summaryaccounted) {
    this.summaryaccounted = summaryaccounted;
  }

  public Accdocqueue reverseaccounting(Boolean reverseaccounting) {
    this.reverseaccounting = reverseaccounting;
    return this;
  }

   /**
   * obráceně [persistentní položka]
   * @return reverseaccounting
  **/
  @ApiModelProperty(example = "null", value = "obráceně [persistentní položka]")
  public Boolean getReverseaccounting() {
    return reverseaccounting;
  }

  public void setReverseaccounting(Boolean reverseaccounting) {
    this.reverseaccounting = reverseaccounting;
  }

  public Accdocqueue reversedepositaccounting(Boolean reversedepositaccounting) {
    this.reversedepositaccounting = reversedepositaccounting;
    return this;
  }

   /**
   * zálohy obráceně [persistentní položka]
   * @return reversedepositaccounting
  **/
  @ApiModelProperty(example = "null", value = "zálohy obráceně [persistentní položka]")
  public Boolean getReversedepositaccounting() {
    return reversedepositaccounting;
  }

  public void setReversedepositaccounting(Boolean reversedepositaccounting) {
    this.reversedepositaccounting = reversedepositaccounting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Accdocqueue accdocqueue = (Accdocqueue) o;
    return Objects.equals(this.displayname, accdocqueue.displayname) &&
        Objects.equals(this.id, accdocqueue.id) &&
        Objects.equals(this.classid, accdocqueue.classid) &&
        Objects.equals(this.objversion, accdocqueue.objversion) &&
        Objects.equals(this.hidden, accdocqueue.hidden) &&
        Objects.equals(this.code, accdocqueue.code) &&
        Objects.equals(this.name, accdocqueue.name) &&
        Objects.equals(this.lastnumbers, accdocqueue.lastnumbers) &&
        Objects.equals(this.note, accdocqueue.note) &&
        Objects.equals(this.documenttype, accdocqueue.documenttype) &&
        Objects.equals(this.accountwhere, accdocqueue.accountwhere) &&
        Objects.equals(this.summaryaccounted, accdocqueue.summaryaccounted) &&
        Objects.equals(this.reverseaccounting, accdocqueue.reverseaccounting) &&
        Objects.equals(this.reversedepositaccounting, accdocqueue.reversedepositaccounting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, code, name, lastnumbers, note, documenttype, accountwhere, summaryaccounted, reverseaccounting, reversedepositaccounting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Accdocqueue {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastnumbers: ").append(toIndentedString(lastnumbers)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    documenttype: ").append(toIndentedString(documenttype)).append("\n");
    sb.append("    accountwhere: ").append(toIndentedString(accountwhere)).append("\n");
    sb.append("    summaryaccounted: ").append(toIndentedString(summaryaccounted)).append("\n");
    sb.append("    reverseaccounting: ").append(toIndentedString(reverseaccounting)).append("\n");
    sb.append("    reversedepositaccounting: ").append(toIndentedString(reversedepositaccounting)).append("\n");
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

