/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.Scenario#getICA <em>ICA</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Scenario#getSystem <em>System</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Scenario#getSystemLevelHazard <em>System Level Hazard</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Scenario#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Scenario#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>ICA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ICA</em>' reference.
	 * @see #setICA(InsecureControlAction)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getScenario_ICA()
	 * @model
	 * @generated
	 */
	InsecureControlAction getICA();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Scenario#getICA <em>ICA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ICA</em>' reference.
	 * @see #getICA()
	 * @generated
	 */
	void setICA(InsecureControlAction value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(tau.systemengineering.STPAsec.System)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getScenario_System()
	 * @model required="true"
	 * @generated
	 */
	tau.systemengineering.STPAsec.System getSystem();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Scenario#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(tau.systemengineering.STPAsec.System value);

	/**
	 * Returns the value of the '<em><b>System Level Hazard</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.STPASec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Level Hazard</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getScenario_SystemLevelHazard()
	 * @model required="true"
	 * @generated
	 */
	EList<STPASec> getSystemLevelHazard();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getScenario_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Scenario#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getScenario_Context()
	 * @model
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Scenario#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

} // Scenario
