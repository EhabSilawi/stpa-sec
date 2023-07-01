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
 *   <li>{@link tau.systemengineering.STPAsec.ControlledProcess#getSendsFeedbacks <em>Sends Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlledProcess#getControledProcessSendsInfo <em>Controled Process Sends Info</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess()
 * @model
 * @generated
 */
public interface ControlledProcess extends ControlStructureElement {
	/**
	 * Returns the value of the '<em><b>Sends Feedbacks</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Feedbacks</em>' reference.
	 * @see #setSendsFeedbacks(Feedback)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess_SendsFeedbacks()
	 * @model
	 * @generated
	 */
	Feedback getSendsFeedbacks();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControlledProcess#getSendsFeedbacks <em>Sends Feedbacks</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sends Feedbacks</em>' reference.
	 * @see #getSendsFeedbacks()
	 * @generated
	 */
	void setSendsFeedbacks(Feedback value);

	/**
	 * Returns the value of the '<em><b>Controled Process Sends Info</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.OtherInformation}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.OtherInformation#getControledProcessRecevierInfo <em>Controled Process Recevier Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controled Process Sends Info</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess_ControledProcessSendsInfo()
	 * @see tau.systemengineering.STPAsec.OtherInformation#getControledProcessRecevierInfo
	 * @model opposite="ControledProcessRecevierInfo"
	 * @generated
	 */
	EList<OtherInformation> getControledProcessSendsInfo();

} // ControlledProcess
