/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loss Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.LossScenario#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.LossScenario#getDescription <em>Description</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.LossScenario#getSeverity <em>Severity</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.LossScenario#getSolutions <em>Solutions</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getLossScenario()
 * @model
 * @generated
 */
public interface LossScenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getLossScenario_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.LossScenario#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getLossScenario_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.LossScenario#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getLossScenario_Severity()
	 * @model
	 * @generated
	 */
	String getSeverity();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.LossScenario#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(String value);

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.SecurityRecomendation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getLossScenario_Solutions()
	 * @model
	 * @generated
	 */
	EList<SecurityRecomendation> getSolutions();

} // LossScenario
