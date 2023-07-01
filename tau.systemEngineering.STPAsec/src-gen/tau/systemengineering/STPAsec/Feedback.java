/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getControllerFeedbackReceiver <em>Controller Feedback Receiver</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback()
 * @model
 * @generated
 */
public interface Feedback extends ControlStructureElement {
	/**
	 * Returns the value of the '<em><b>Controller Feedback Receiver</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlStructure}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlStructure#getSendsFeedbacks <em>Sends Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Feedback Receiver</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_ControllerFeedbackReceiver()
	 * @see tau.systemengineering.STPAsec.ControlStructure#getSendsFeedbacks
	 * @model opposite="sendsFeedbacks"
	 * @generated
	 */
	EList<ControlStructure> getControllerFeedbackReceiver();

} // Feedback
