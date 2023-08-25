/**
 */
package tau.systemengineering.STPAsec.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tau.systemengineering.STPAsec.CmdFlow;
import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.ControlLoop;
import tau.systemengineering.STPAsec.ControllerConstraints;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.FeedbackFlow;
import tau.systemengineering.STPAsec.InfoFlow;
import tau.systemengineering.STPAsec.Information;
import tau.systemengineering.STPAsec.InsecureControlAction;
import tau.systemengineering.STPAsec.Loss;
import tau.systemengineering.STPAsec.STPASec;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.Scenario;
import tau.systemengineering.STPAsec.SystemLevelConstraint;
import tau.systemengineering.STPAsec.SystemLevelHazard;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tau.systemengineering.STPAsec.STPAsecPackage
 * @generated
 */
public class STPAsecSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static STPAsecPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STPAsecSwitch() {
		if (modelPackage == null) {
			modelPackage = STPAsecPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case STPAsecPackage.STPA_SEC: {
			STPASec stpaSec = (STPASec) theEObject;
			T result = caseSTPASec(stpaSec);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.SYSTEM: {
			tau.systemengineering.STPAsec.System system = (tau.systemengineering.STPAsec.System) theEObject;
			T result = caseSystem(system);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.CONTROL_ACTION: {
			ControlAction controlAction = (ControlAction) theEObject;
			T result = caseControlAction(controlAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.FEEDBACK: {
			Feedback feedback = (Feedback) theEObject;
			T result = caseFeedback(feedback);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.CONTROL_LOOP: {
			ControlLoop controlLoop = (ControlLoop) theEObject;
			T result = caseControlLoop(controlLoop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.CMD_FLOW: {
			CmdFlow cmdFlow = (CmdFlow) theEObject;
			T result = caseCmdFlow(cmdFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.FEEDBACK_FLOW: {
			FeedbackFlow feedbackFlow = (FeedbackFlow) theEObject;
			T result = caseFeedbackFlow(feedbackFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.INFO_FLOW: {
			InfoFlow infoFlow = (InfoFlow) theEObject;
			T result = caseInfoFlow(infoFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.INFORMATION: {
			Information information = (Information) theEObject;
			T result = caseInformation(information);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.LOSS: {
			Loss loss = (Loss) theEObject;
			T result = caseLoss(loss);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD: {
			SystemLevelHazard systemLevelHazard = (SystemLevelHazard) theEObject;
			T result = caseSystemLevelHazard(systemLevelHazard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT: {
			SystemLevelConstraint systemLevelConstraint = (SystemLevelConstraint) theEObject;
			T result = caseSystemLevelConstraint(systemLevelConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.INSECURE_CONTROL_ACTION: {
			InsecureControlAction insecureControlAction = (InsecureControlAction) theEObject;
			T result = caseInsecureControlAction(insecureControlAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.CONTROLLER_CONSTRAINTS: {
			ControllerConstraints controllerConstraints = (ControllerConstraints) theEObject;
			T result = caseControllerConstraints(controllerConstraints);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case STPAsecPackage.SCENARIO: {
			Scenario scenario = (Scenario) theEObject;
			T result = caseScenario(scenario);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STPA Sec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STPA Sec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTPASec(STPASec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(tau.systemengineering.STPAsec.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlAction(ControlAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedback(Feedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlLoop(ControlLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmdFlow(CmdFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedbackFlow(FeedbackFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoFlow(InfoFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformation(Information object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loss</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loss</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoss(Loss object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Level Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Level Hazard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemLevelHazard(SystemLevelHazard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Level Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Level Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemLevelConstraint(SystemLevelConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insecure Control Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insecure Control Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsecureControlAction(InsecureControlAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerConstraints(ControllerConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //STPAsecSwitch
