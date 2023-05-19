/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controlled Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.ControlledProcess#getFeedbacks <em>Feedbacks</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess()
 * @model
 * @generated
 */
public interface ControlledProcess extends StructureElement {

	/**
	 * Returns the value of the '<em><b>Feedbacks</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getControlledProcess <em>Controlled Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedbacks</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess_Feedbacks()
	 * @see tau.systemengineering.STPAsec.Feedback#getControlledProcess
	 * @model opposite="controlledProcess"
	 * @generated
	 */
	EList<Feedback> getFeedbacks();
} // ControlledProcess
