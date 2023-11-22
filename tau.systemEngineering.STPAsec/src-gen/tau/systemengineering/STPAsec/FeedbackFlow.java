/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.FeedbackFlow#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.FeedbackFlow#getFeedbackSender <em>Feedback Sender</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.FeedbackFlow#getFeedbackReceiver <em>Feedback Receiver</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.FeedbackFlow#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedbackFlow()
 * @model
 * @generated
 */
public interface FeedbackFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedbackFlow_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.FeedbackFlow#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Feedback Sender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.System#getSendsFeedback <em>Sends Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Sender</em>' reference.
	 * @see #setFeedbackSender(tau.systemengineering.STPAsec.System)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedbackFlow_FeedbackSender()
	 * @see tau.systemengineering.STPAsec.System#getSendsFeedback
	 * @model opposite="sendsFeedback" required="true"
	 * @generated
	 */
	tau.systemengineering.STPAsec.System getFeedbackSender();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.FeedbackFlow#getFeedbackSender <em>Feedback Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Sender</em>' reference.
	 * @see #getFeedbackSender()
	 * @generated
	 */
	void setFeedbackSender(tau.systemengineering.STPAsec.System value);

	/**
	 * Returns the value of the '<em><b>Feedback Receiver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.System#getReceivesFeedback <em>Receives Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Receiver</em>' reference.
	 * @see #setFeedbackReceiver(tau.systemengineering.STPAsec.System)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedbackFlow_FeedbackReceiver()
	 * @see tau.systemengineering.STPAsec.System#getReceivesFeedback
	 * @model opposite="receivesFeedback" required="true"
	 * @generated
	 */
	tau.systemengineering.STPAsec.System getFeedbackReceiver();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.FeedbackFlow#getFeedbackReceiver <em>Feedback Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Receiver</em>' reference.
	 * @see #getFeedbackReceiver()
	 * @generated
	 */
	void setFeedbackReceiver(tau.systemengineering.STPAsec.System value);

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedbackFlow_Feedback()
	 * @model required="true"
	 * @generated
	 */
	EList<Feedback> getFeedback();

} // FeedbackFlow
