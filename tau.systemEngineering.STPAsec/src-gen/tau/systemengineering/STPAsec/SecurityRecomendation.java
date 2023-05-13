/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Recomendation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.SecurityRecomendation#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.SecurityRecomendation#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSecurityRecomendation()
 * @model
 * @generated
 */
public interface SecurityRecomendation extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSecurityRecomendation_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.SecurityRecomendation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' attribute.
	 * @see #setSolution(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSecurityRecomendation_Solution()
	 * @model
	 * @generated
	 */
	String getSolution();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.SecurityRecomendation#getSolution <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' attribute.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(String value);

} // SecurityRecomendation
