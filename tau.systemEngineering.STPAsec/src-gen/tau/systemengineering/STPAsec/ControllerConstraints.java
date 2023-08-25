/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.ControllerConstraints#getICA <em>ICA</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControllerConstraints#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControllerConstraints#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControllerConstraints#getSystemlevelhazard <em>Systemlevelhazard</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControllerConstraints()
 * @model
 * @generated
 */
public interface ControllerConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>ICA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ICA</em>' reference.
	 * @see #setICA(InsecureControlAction)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControllerConstraints_ICA()
	 * @model
	 * @generated
	 */
	InsecureControlAction getICA();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControllerConstraints#getICA <em>ICA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ICA</em>' reference.
	 * @see #getICA()
	 * @generated
	 */
	void setICA(InsecureControlAction value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControllerConstraints_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControllerConstraints#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControllerConstraints_Constraints()
	 * @model
	 * @generated
	 */
	String getConstraints();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControllerConstraints#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(String value);

	/**
	 * Returns the value of the '<em><b>Systemlevelhazard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemlevelhazard</em>' reference.
	 * @see #setSystemlevelhazard(SystemLevelHazard)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControllerConstraints_Systemlevelhazard()
	 * @model
	 * @generated
	 */
	SystemLevelHazard getSystemlevelhazard();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControllerConstraints#getSystemlevelhazard <em>Systemlevelhazard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systemlevelhazard</em>' reference.
	 * @see #getSystemlevelhazard()
	 * @generated
	 */
	void setSystemlevelhazard(SystemLevelHazard value);

} // ControllerConstraints
