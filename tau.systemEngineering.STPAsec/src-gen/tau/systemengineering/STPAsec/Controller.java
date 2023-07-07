/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getSendsFeedbacks <em>Sends Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getSendsCommands <em>Sends Commands</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getSendsInfo <em>Sends Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getReceivesInfo <em>Receives Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getReceivesFeedbacks <em>Receives Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getReceivesCommands <em>Receives Commands</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends ControlStructureElement {
	/**
	 * Returns the value of the '<em><b>Sends Feedbacks</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getControllerSenders <em>Controller Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Feedbacks</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_SendsFeedbacks()
	 * @see tau.systemengineering.STPAsec.Feedback#getControllerSenders
	 * @model opposite="controllerSenders"
	 * @generated
	 */
	EList<Feedback> getSendsFeedbacks();

	/**
	 * Returns the value of the '<em><b>Sends Commands</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlAction#getControllerSenders <em>Controller Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Commands</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_SendsCommands()
	 * @see tau.systemengineering.STPAsec.ControlAction#getControllerSenders
	 * @model opposite="controllerSenders"
	 * @generated
	 */
	EList<ControlAction> getSendsCommands();

	/**
	 * Returns the value of the '<em><b>Sends Info</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.OtherInformation}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.OtherInformation#getControllerSenders <em>Controller Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Info</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_SendsInfo()
	 * @see tau.systemengineering.STPAsec.OtherInformation#getControllerSenders
	 * @model opposite="controllerSenders"
	 * @generated
	 */
	EList<OtherInformation> getSendsInfo();

	/**
	 * Returns the value of the '<em><b>Receives Info</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.OtherInformation}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.OtherInformation#getControllerReceivers <em>Controller Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives Info</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_ReceivesInfo()
	 * @see tau.systemengineering.STPAsec.OtherInformation#getControllerReceivers
	 * @model opposite="controllerReceivers"
	 * @generated
	 */
	EList<OtherInformation> getReceivesInfo();

	/**
	 * Returns the value of the '<em><b>Receives Feedbacks</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getControllerReceivers <em>Controller Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives Feedbacks</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_ReceivesFeedbacks()
	 * @see tau.systemengineering.STPAsec.Feedback#getControllerReceivers
	 * @model opposite="controllerReceivers"
	 * @generated
	 */
	EList<Feedback> getReceivesFeedbacks();

	/**
	 * Returns the value of the '<em><b>Receives Commands</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlAction#getControllerReceivers <em>Controller Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives Commands</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_ReceivesCommands()
	 * @see tau.systemengineering.STPAsec.ControlAction#getControllerReceivers
	 * @model opposite="controllerReceivers"
	 * @generated
	 */
	EList<ControlAction> getReceivesCommands();

} // Controller
