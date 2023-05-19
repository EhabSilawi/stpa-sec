/**
 */
package tau.systemengineering.STPAsec.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.ControlStructure;
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.Controller;
import tau.systemengineering.STPAsec.DataFlow;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.Hazard;
import tau.systemengineering.STPAsec.LossScenario;
import tau.systemengineering.STPAsec.MissionGoal;
import tau.systemengineering.STPAsec.STPASec;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.SecurityRecomendation;
import tau.systemengineering.STPAsec.StructureElement;
import tau.systemengineering.STPAsec.UnsafeControlAction;

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
		public Adapter caseLossScenario(LossScenario object) {
			return createLossScenarioAdapter();
		}

		@Override
		public Adapter caseHazard(Hazard object) {
			return createHazardAdapter();
		}

		@Override
		public Adapter caseMissionGoal(MissionGoal object) {
			return createMissionGoalAdapter();
		}

		@Override
		public Adapter caseSecurityRecomendation(SecurityRecomendation object) {
			return createSecurityRecomendationAdapter();
		}

		@Override
		public Adapter caseSystem(tau.systemengineering.STPAsec.System object) {
			return createSystemAdapter();
		}

		@Override
		public Adapter caseSTPASec(STPASec object) {
			return createSTPASecAdapter();
		}

		@Override
		public Adapter caseFeedback(Feedback object) {
			return createFeedbackAdapter();
		}

		@Override
		public Adapter caseStructureElement(StructureElement object) {
			return createStructureElementAdapter();
		}

		@Override
		public Adapter caseControlledProcess(ControlledProcess object) {
			return createControlledProcessAdapter();
		}

		@Override
		public Adapter caseController(Controller object) {
			return createControllerAdapter();
		}

		@Override
		public Adapter caseControlStructure(ControlStructure object) {
			return createControlStructureAdapter();
		}

		@Override
		public Adapter caseControlAction(ControlAction object) {
			return createControlActionAdapter();
		}

		@Override
		public Adapter caseDataFlow(DataFlow object) {
			return createDataFlowAdapter();
		}

		@Override
		public Adapter caseUnsafeControlAction(UnsafeControlAction object) {
			return createUnsafeControlActionAdapter();
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
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.LossScenario <em>Loss Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.LossScenario
	 * @generated
	 */
	public Adapter createLossScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.Hazard
	 * @generated
	 */
	public Adapter createHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.MissionGoal <em>Mission Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.MissionGoal
	 * @generated
	 */
	public Adapter createMissionGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.SecurityRecomendation <em>Security Recomendation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.SecurityRecomendation
	 * @generated
	 */
	public Adapter createSecurityRecomendationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.StructureElement <em>Structure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.StructureElement
	 * @generated
	 */
	public Adapter createStructureElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.ControlledProcess <em>Controlled Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.ControlledProcess
	 * @generated
	 */
	public Adapter createControlledProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.ControlStructure <em>Control Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.ControlStructure
	 * @generated
	 */
	public Adapter createControlStructureAdapter() {
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
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tau.systemengineering.STPAsec.UnsafeControlAction <em>Unsafe Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tau.systemengineering.STPAsec.UnsafeControlAction
	 * @generated
	 */
	public Adapter createUnsafeControlActionAdapter() {
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
