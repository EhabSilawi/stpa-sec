/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getElements <em>Elements</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getSubSystems <em>Sub Systems</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure()
 * @model
 * @generated
 */
public interface ControlStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.StructureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureElement> getElements();

	/**
	 * Returns the value of the '<em><b>Sub Systems</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Systems</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_SubSystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<tau.systemengineering.STPAsec.System> getSubSystems();

} // ControlStructure
