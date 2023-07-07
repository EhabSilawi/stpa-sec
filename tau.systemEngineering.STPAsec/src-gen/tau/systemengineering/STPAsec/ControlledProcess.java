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
 *   <li>{@link tau.systemengineering.STPAsec.ControlledProcess#getSendsInfo <em>Sends Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlledProcess#getReceivesInfo <em>Receives Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlledProcess#getReceivesCommands <em>Receives Commands</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlledProcess#getReceivesFeedbacks <em>Receives Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlledProcess#getSendsFeedbacks <em>Sends Feedbacks</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess()
 * @model
 * @generated
 */
public interface ControlledProcess extends ControlStructureElement {
	/**
	 * Returns the value of the '<em><b>Sends Info</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.OtherInformation}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.OtherInformation#getControledProcessSenders <em>Controled Process Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Info</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess_SendsInfo()
	 * @see tau.systemengineering.STPAsec.OtherInformation#getControledProcessSenders
	 * @model opposite="controledProcessSenders"
	 * @generated
	 */
	EList<OtherInformation> getSendsInfo();

	/**
	 * Returns the value of the '<em><b>Sends Feedbacks</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getControledProcessSenders <em>Controled Process Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Feedbacks</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess_SendsFeedbacks()
	 * @see tau.systemengineering.STPAsec.Feedback#getControledProcessSenders
	 * @model opposite="controledProcessSenders"
	 * @generated
	 */
	EList<Feedback> getSendsFeedbacks();

	/**
	 * Returns the value of the '<em><b>Receives Info</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.OtherInformation}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.OtherInformation#getControledProcessReceivers <em>Controled Process Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives Info</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess_ReceivesInfo()
	 * @see tau.systemengineering.STPAsec.OtherInformation#getControledProcessReceivers
	 * @model opposite="controledProcessReceivers"
	 * @generated
	 */
	EList<OtherInformation> getReceivesInfo();

	/**
	 * Returns the value of the '<em><b>Receives Commands</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlAction#getControledProccessReceivers <em>Controled Proccess Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives Commands</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess_ReceivesCommands()
	 * @see tau.systemengineering.STPAsec.ControlAction#getControledProccessReceivers
	 * @model opposite="controledProccessReceivers"
	 * @generated
	 */
	EList<ControlAction> getReceivesCommands();

	/**
	 * Returns the value of the '<em><b>Receives Feedbacks</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getControledProcessReceivers <em>Controled Process Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives Feedbacks</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess_ReceivesFeedbacks()
	 * @see tau.systemengineering.STPAsec.Feedback#getControledProcessReceivers
	 * @model opposite="controledProcessReceivers"
	 * @generated
	 */
	EList<Feedback> getReceivesFeedbacks();

} // ControlledProcess
