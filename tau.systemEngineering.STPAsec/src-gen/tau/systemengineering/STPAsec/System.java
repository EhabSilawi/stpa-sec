/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.System#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getName <em>Name</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getDescription <em>Description</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getSystemMode <em>System Mode</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Subsystems</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystems</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Subsystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<System> getSubsystems();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.System#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>System Mode</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Mode</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_SystemMode()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlStructure> getSystemMode();

} // System
