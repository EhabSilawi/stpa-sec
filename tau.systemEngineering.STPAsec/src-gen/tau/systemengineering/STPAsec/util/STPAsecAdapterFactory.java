/**
 */
package tau.systemengineering.STPAsec.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tau.systemengineering.STPAsec.STPAsecPackage
 * @generated
 */
public class STPAsecAdapterFactory extends AdapterFactoryImpl {

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static STPAsecPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STPAsecAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = STPAsecPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STPAsecSwitch<Adapter> modelSwitch = new STPAsecSwitch<Adapter>() {
		@Override
		public Adapter caseSTPASec(STPASec object) {
			return createSTPASecAdapter();
		}

		@Override
		public Adapter caseSystem(tau.systemengineering.STPAsec.System object) {
			return createSystemAdapter();
		}

		@Override
		public Adapter caseControlAction(ControlAction object) {
			return createControlActionAdapter();
		}

		@Override
		public Adapter caseFeedback(Feedback object) {
			return createFeedbackAdapter();
		}

		@Override
		public Adapter caseControlLoop(ControlLoop object) {
			return createControlLoopAdapter();
		}

		@Override
		public Adapter caseCmdFlow(CmdFlow object) {
			return createCmdFlowAdapter();
		}

		@Override
		public Adapter caseFeedbackFlow(FeedbackFlow object) {
			return createFeedbackFlowAdapter();
		}

		@Override
		public Adapter caseInfoFlow(InfoFlow object) {
			return createInfoFlowAdapter();
		}

		@Override
		public Adapter caseInformation(Information object) {
			return createInformationAdapter();
		}

		@Override
		public Adapter caseLoss(Loss object) {
			return createLossAdapter();
		}

		@Override
		public Adapter caseSystemLevelHazard(SystemLevelHazard object) {
			return createSystemLevelHazardAdapter();
		}

		@Override
		public Adapter caseSystemLevelConstraint(SystemLevelConstraint object) {
			return createSystemLevelConstraintAdapter();
		}

		@Override
		public Adapter caseInsecureControlAction(InsecureControlAction object) {
			return createInsecureControlActionAdapter();
		}

		@Override
		public Adapter caseControllerConstraints(ControllerConstraints object) {
			return createControllerConstraintsAdapter();
		}

		@Override
		public Adapter caseScenario(Scenario object) {
			return createScenarioAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.STPASec <em>STPA Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.STPASec
	 * @generated
	 */
	public Adapter createSTPASecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.ControlAction <em>Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.ControlAction
	 * @generated
	 */
	public Adapter createControlActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.Feedback
	 * @generated
	 */
	public Adapter createFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.ControlLoop <em>Control Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.ControlLoop
	 * @generated
	 */
	public Adapter createControlLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.CmdFlow <em>Cmd Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.CmdFlow
	 * @generated
	 */
	public Adapter createCmdFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.FeedbackFlow <em>Feedback Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.FeedbackFlow
	 * @generated
	 */
	public Adapter createFeedbackFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.InfoFlow <em>Info Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.InfoFlow
	 * @generated
	 */
	public Adapter createInfoFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.Information
	 * @generated
	 */
	public Adapter createInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.Loss <em>Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.Loss
	 * @generated
	 */
	public Adapter createLossAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.SystemLevelHazard <em>System Level Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.SystemLevelHazard
	 * @generated
	 */
	public Adapter createSystemLevelHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.SystemLevelConstraint <em>System Level Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.SystemLevelConstraint
	 * @generated
	 */
	public Adapter createSystemLevelConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.InsecureControlAction <em>Insecure Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.InsecureControlAction
	 * @generated
	 */
	public Adapter createInsecureControlActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.ControllerConstraints <em>Controller Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.ControllerConstraints
	 * @generated
	 */
	public Adapter createControllerConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //STPAsecAdapterFactory
