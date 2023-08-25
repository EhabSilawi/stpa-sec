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
 *   <li>{@link tau.systemengineering.STPAsec.System#getControAction <em>Contro Action</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getControlLoop <em>Control Loop</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getSubSystem <em>Sub System</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getName <em>Name</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getGoal <em>Goal</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getInformation <em>Information</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getReceivesInfo <em>Receives Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getSendsInfo <em>Sends Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getReceivesFeedback <em>Receives Feedback</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getSendsFeedback <em>Sends Feedback</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getControls <em>Controls</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getPerforms <em>Performs</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getControllerConstraints <em>Controller Constraints</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Contro Action</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contro Action</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_ControAction()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlAction> getControAction();

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Feedback()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feedback> getFeedback();

	/**
	 * Returns the value of the '<em><b>Control Loop</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlLoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Loop</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_ControlLoop()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlLoop> getControlLoop();

	/**
	 * Returns the value of the '<em><b>Sub System</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub System</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_SubSystem()
	 * @model containment="true"
	 * @generated
	 */
	EList<System> getSubSystem();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.System#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see #setGoal(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Goal()
	 * @model
	 * @generated
	 */
	String getGoal();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.System#getGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(String value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Information}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Information()
	 * @model containment="true"
	 * @generated
	 */
	EList<Information> getInformation();

	/**
	 * Returns the value of the '<em><b>Receives Info</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.InfoFlow}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.InfoFlow#getInfoReceiver <em>Info Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives Info</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_ReceivesInfo()
	 * @see tau.systemengineering.STPAsec.InfoFlow#getInfoReceiver
	 * @model opposite="infoReceiver"
	 * @generated
	 */
	EList<InfoFlow> getReceivesInfo();

	/**
	 * Returns the value of the '<em><b>Sends Info</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.InfoFlow}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.InfoFlow#getInfoSender <em>Info Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Info</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_SendsInfo()
	 * @see tau.systemengineering.STPAsec.InfoFlow#getInfoSender
	 * @model opposite="infoSender"
	 * @generated
	 */
	EList<InfoFlow> getSendsInfo();

	/**
	 * Returns the value of the '<em><b>Receives Feedback</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.FeedbackFlow}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.FeedbackFlow#getFeedbackReceiver <em>Feedback Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives Feedback</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_ReceivesFeedback()
	 * @see tau.systemengineering.STPAsec.FeedbackFlow#getFeedbackReceiver
	 * @model opposite="feedbackReceiver"
	 * @generated
	 */
	EList<FeedbackFlow> getReceivesFeedback();

	/**
	 * Returns the value of the '<em><b>Sends Feedback</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.FeedbackFlow}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.FeedbackFlow#getFeedbackSender <em>Feedback Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Feedback</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_SendsFeedback()
	 * @see tau.systemengineering.STPAsec.FeedbackFlow#getFeedbackSender
	 * @model opposite="feedbackSender"
	 * @generated
	 */
	EList<FeedbackFlow> getSendsFeedback();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.CmdFlow}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.CmdFlow#getControledBy <em>Controled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Controls()
	 * @see tau.systemengineering.STPAsec.CmdFlow#getControledBy
	 * @model opposite="controledBy"
	 * @generated
	 */
	EList<CmdFlow> getControls();

	/**
	 * Returns the value of the '<em><b>Performs</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.CmdFlow}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.CmdFlow#getPerformedBy <em>Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performs</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Performs()
	 * @see tau.systemengineering.STPAsec.CmdFlow#getPerformedBy
	 * @model opposite="performedBy"
	 * @generated
	 */
	EList<CmdFlow> getPerforms();

	/**
	 * Returns the value of the '<em><b>Controller Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControllerConstraints}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Constraints</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_ControllerConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControllerConstraints> getControllerConstraints();

} // System
