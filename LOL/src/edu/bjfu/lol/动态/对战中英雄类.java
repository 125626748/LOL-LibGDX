package edu.bjfu.lol.��̬;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.MoveByAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

import edu.bjfu.lol.����;
import edu.bjfu.lol.scenes.scene2d.actions.����ƶ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.����ǰҡ������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.����ǰҡ������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.scenes.scene2d.����.����Ӣ��Ѫ��������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.screen.��ս��Ļ��.Ӣ��������;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ��������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ��ս��Ӣ���� {
	private ��ս�������� ��������;
	private int Ӣ������λ��;
	private Ӣ�����Ա仯�� Ӣ�����Ա仯 = new Ӣ�����Ա仯��();
	private Ӣ�������� ��ս��Ӣ������;
	private ��ս�м�����[] ��ս�м�������;
	public ��ս�м�����[] get��ս�м�������() {
		return ��ս�м�������;
	}
	private int ����ֵ;
	private Ӣ���� Ӣ��;
	private boolean ����;
	private Set<״̬��> ����������״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ����������״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ����ǿ������״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ����ǿ�ȼ���״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ����ֵ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ����ֵ����״̬���� = new HashSet<״̬��>();
	private Set<����ֵ��������״̬��> ����ֵ��������״̬���� = new HashSet<����ֵ��������״̬��>();
	private Set<����ֵ����״̬��> ����ֵ����״̬���� = new HashSet<����ֵ����״̬��>();
	private Set<״̬��> ����ֵ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ����ֵ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> �����ٶ�����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> �����ٶȼ���״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ħ����������״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ħ�����Լ���״̬���� = new HashSet<״̬��>();
	private Set<״̬��> �������ֵ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> �������ֵ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ����ֵ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ����ֵ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> �����ظ�����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> �����ظ�����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ���״�͸��ֵ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ���״�͸�ٷֱ�����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ���״�͸��ֵ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ���״�͸�ٷֱȼ���״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ������͸��ֵ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ������͸�ٷֱ�����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ������͸��ֵ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ������͸�ٷֱȼ���״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ����͵ȡ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ����͵ȡ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ������������״̬���� = new HashSet<״̬��>();
	private Set<״̬��> �������ʼ���״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ������Ѫ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ������Ѫ����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ��������״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ���Լ���״̬���� = new HashSet<״̬��>();
	private Set<����Ĭ״̬��> ����Ĭ״̬���� = new HashSet<����Ĭ״̬��>();
	private Set<������״̬��> ������״̬���� = new HashSet<������״̬��>();
	private Set<������״̬��> ������״̬���� = new HashSet<������״̬��>();
	private Set<������״̬��> ������״̬���� = new HashSet<������״̬��>();
	private Set<��ѣ��״̬��> ��ѣ��״̬���� = new HashSet<��ѣ��״̬��>();
	private Set<��ѹ��״̬��> ��ѹ��״̬���� = new HashSet<��ѹ��״̬��>();
	private Set<״̬��> �˺�����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> �����˺�����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> ħ���˺�����״̬���� = new HashSet<״̬��>();
	private Set<״̬��> �з���Ӣ����������״̬���� = new HashSet<״̬��>();
	private Set<�з�����״̬������Ӣ��״̬��> �з�����״̬������Ӣ��״̬���� = new HashSet<�з�����״̬������Ӣ��״̬��>();
	private Set<��ͨ��������Ч��״̬��> ��ͨ��������Ч��״̬���� = new HashSet<��ͨ��������Ч��״̬��>();
	private Set<����ͨ��������Ч��״̬��> ����ͨ��������Ч��״̬���� = new HashSet<����ͨ��������Ч��״̬��>();
	private Set<����״̬��> ����״̬���� = new HashSet<����״̬��>();
	private Set<����״̬��> ����״̬���� = new HashSet<����״̬��>();
	private Set<����״̬��> ����״̬���� = new HashSet<����״̬��>();
	private Set<����״̬��> ħ������״̬���� = new HashSet<����״̬��>();
	private Set<����״̬��> �޵�״̬���� = new HashSet<����״̬��>();
	private Set<����ä״̬��> ����ä״̬���� = new HashSet<����ä״̬��>();
	private Set<������״̬��> ������״̬���� = new HashSet<������״̬��>();
	private Set<��ù�����������״̬��> ��ù�����������״̬���� = new HashSet<��ù�����������״̬��>();
	private Set<���������ͷ�״̬��> ���������ͷ�״̬���� = new HashSet<���������ͷ�״̬��>();
	private boolean is��ù�����������;
	private int ��ս�б�������;
	private ��������ʩ��״̬�� ��������ʩ��״̬;
	private boolean is����ֵ��������;
	private boolean is����ֵ����;
	private boolean is����;
	private boolean is����;
	private int �˺���ֵ����;
	private float �˺��ٷֱȼ���;
	private int �����˺���ֵ����;
	private float �����˺��ٷֱȼ���;
	private int ħ���˺���ֵ����;
	private float ħ���˺��ٷֱȼ���;
	private boolean ����ä;
	private boolean ����Ĭ;
	private boolean ������;
	private boolean ������;
	private boolean ������;
	private boolean ��ѣ��;
	private boolean ��ѹ��;
	private boolean is�ҷ�;
	private int ��ɱ��;
	/**
	 * @param ������ ������ʱ������е�Ч��
	 */
	public void ��������״̬����Ч��(���������� ��������)
	{
		// �����������
		if (����)
		{
			// ��������״̬
			��������.�������(new ��������������(is�ҷ�, Ӣ������λ��, false));
			// ���ó�Ĭ״̬
			��������.�������(new ���ó�Ĭ������(is�ҷ�, Ӣ������λ��, false));
			// ���ñ���Ч��
			��������.�������(new ���ñ���������(is�ҷ�, Ӣ������λ��, false));
			// ���û���Ч��
			��������.�������(new ���û���������(is�ҷ�, Ӣ������λ��, false));
			// ���ó���Ч��
			��������.�������(new ���ó���������(is�ҷ�, Ӣ������λ��, false));
			// ����ѣ��Ч��
			��������.�������(new ����ѣ��������(is�ҷ�, Ӣ������λ��, false));
			// ����ѹ��Ч��
			��������.�������(new ����ѹ��������(is�ҷ�, Ӣ������λ��, false));
			// ������äЧ��
			��������.�������(new ������ä������(is�ҷ�, Ӣ������λ��, false));
			// ���ü���Ч��
			��������.�������(new ���ü���������(is�ҷ�, Ӣ������λ��, false));
		}
		else
		{
			// ��������״̬
			��������.�������(new ��������������(is�ҷ�, Ӣ������λ��, is��ս������()));
			// ���ó�Ĭ״̬
			��������.�������(new ���ó�Ĭ������(is�ҷ�, Ӣ������λ��, is��ս�б���Ĭ()));
			// ���ñ���Ч��
			��������.�������(new ���ñ���������(is�ҷ�, Ӣ������λ��, is��ս�б�����()));
			// ���û���Ч��
			��������.�������(new ���û���������(is�ҷ�, Ӣ������λ��, is��ս�б�����()));
			// ���ó���Ч��
			��������.�������(new ���ó���������(is�ҷ�, Ӣ������λ��, is��ս�б�����()));
			// ����ѣ��Ч��
			��������.�������(new ����ѣ��������(is�ҷ�, Ӣ������λ��, is��ս�б�ѣ��()));
			// ����ѹ��Ч��
			��������.�������(new ����ѹ��������(is�ҷ�, Ӣ������λ��, is��ս�б�ѹ��()));
			// ������äЧ��
			��������.�������(new ������ä������(is�ҷ�, Ӣ������λ��, is��ս�б���ä()));
			// ���ü���Ч��
			��������.�������(new ���ü���������(is�ҷ�, Ӣ������λ��, is��ս�б�����()));
		}
	}
	/**
	 * ���ô˷����õ���Ϣ���ڵ���
	 */
	public void �����ս��Ӣ����Ϣ()
	{
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", String.format("<%s>\n",  get����������λ��Ӣ������()));
		���㹥����();
		���㷨��ǿ��();
		��������ֵ();
		���㻤��ֵ();
		����ħ������();
		���㹥���ٶ�();
		�����������ֵ();
		���������ظ�();
		������ֵ���״�͸();
		����ٷֱȻ��״�͸();
		������ֵ������͸();
		����ٷֱȷ�����͸();
		��������͵ȡ();
		���㱩������();
		���㷨����Ѫ();
		��������();
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<Ӣ�۳�ʼ����>");
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", String.format("��ʼ�������ֵ:%d,��ʼ������:%d,��ʼ����ǿ��:%d,��ʼ����ֵ:%d,��ʼ����ֵ:%d,��ʼħ������:%d\n��ʼ�����ٶ�:%.2f,��ʼ�����ظ�:%d,��ʼ���״�͸:%d|%.1f%%,��ʼ������͸:%d|%.1f%%\n��ʼ����͵ȡ:%.1f%%,��ʼ��������:%.1f%%,��ʼ������Ѫ:%.1f%%,��ʼ����%.1f%%\n", get��ʼ�������ֵ(), get��ʼ������(), get��ʼ����ǿ��(), get��ʼ����ֵ(), get��ʼ����ֵ(), get��ʼħ������(), get��ʼ�����ٶ�(), get��ʼ�����ظ�(), get��ʼ��ֵ���״�͸(), get��ʼ�ٷֱȻ��״�͸() * 100, get��ʼ��ֵ������͸(), get��ʼ�ٷֱȷ�����͸() * 100, get��ʼ����͵ȡ() * 100, get��ʼ��������() * 100, get��ʼ������Ѫ() * 100, get��ʼ����() * 100));
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<Ӣ�����Ա仯>");
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", String.format("�������仯:%d|%.1f%%,����ǿ�ȱ仯:%d|%.1f%%,����ֵ�仯:%d|%.1f%%,����ֵ�仯:%d|%.1f%%\n�����ٶȱ仯:%.1f%%,ħ�����Ա仯:%d|%.1f%%,�������ֵ�仯:%d|%.1f%%\n�����ظ��仯:%d|%.1f%%,���״�͸�仯:%d|%.1f%%,������͸�仯:%d|%.1f%%\n����͵ȡ�仯:%.1f,�������ʱ仯:%.1f%%,������Ѫ�仯:%.1f%%,���Ա仯:%.1f%%\n", 
				Ӣ�����Ա仯.get��������ֵ�仯(), Ӣ�����Ա仯.get�������ٷֱȱ仯() * 100, Ӣ�����Ա仯.get����ǿ����ֵ�仯(), Ӣ�����Ա仯.get����ǿ�Ȱٷֱȱ仯() * 100, Ӣ�����Ա仯.get����ֵ��ֵ�仯(), Ӣ�����Ա仯.get����ֵ�ٷֱȱ仯() * 100, Ӣ�����Ա仯.get������ֵ�仯(), Ӣ�����Ա仯.get���װٷֱȱ仯() * 100,
				Ӣ�����Ա仯.get�����ٶȰٷֱȱ仯() * 100, Ӣ�����Ա仯.getħ��������ֵ�仯(), Ӣ�����Ա仯.getħ�����԰ٷֱȱ仯() * 100, Ӣ�����Ա仯.get�������ֵ��ֵ�仯(), Ӣ�����Ա仯.get�������ֵ�ٷֱȱ仯() * 100, Ӣ�����Ա仯.get�����ظ���ֵ�仯(), Ӣ�����Ա仯.get�����ظ��ٷֱȱ仯() * 100,
				Ӣ�����Ա仯.get��ֵ���״�͸�仯(), Ӣ�����Ա仯.get�ٷֱȻ��״�͸�仯() * 100, Ӣ�����Ա仯.get��ֵ������͸�仯(), Ӣ�����Ա仯.get�ٷֱȷ�����͸�仯() * 100, Ӣ�����Ա仯.get����͵ȡ�ٷֱȱ仯() * 100, Ӣ�����Ա仯.get�������ʰٷֱȱ仯() * 100, Ӣ�����Ա仯.get������Ѫ�ٷֱȱ仯() * 100, Ӣ�����Ա仯.get���԰ٷֱȱ仯() * 100));
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<Ӣ����������>");
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", String.format("����ֵ/�������ֵ:%d/%d,������:%d,����ǿ��:%d,����ֵ:%d,����ֵ:%d,ħ������:%d\n�����ٶ�:%.2f,�����ظ�:%d,���״�͸:%d|%.1f%%,������͸:%d|%.1f%%\n����͵ȡ:%.1f%%,��������:%.1f%%,������Ѫ:%.1f%%,����%.1f%%\n", ����ֵ, ��ս��Ӣ������.get�������ֵ(), ��ս��Ӣ������.get������(), ��ս��Ӣ������.get����ǿ��(), ��ս��Ӣ������.get����ֵ(), ��ս��Ӣ������.get����ֵ(), ��ս��Ӣ������.getħ������(), ��ս��Ӣ������.get�����ٶ�(), ��ս��Ӣ������.get�����ظ�(), ��ս��Ӣ������.get��ֵ���״�͸(), ��ս��Ӣ������.get�ٷֱȻ��״�͸() * 100, ��ս��Ӣ������.get��ֵ������͸(), ��ս��Ӣ������.get�ٷֱȷ�����͸() * 100, ��ս��Ӣ������.get����͵ȡ() * 100, ��ս��Ӣ������.get��������() * 100, ��ս��Ӣ������.get������Ѫ() * 100, ��ս��Ӣ������.get����() * 100));
		���㱻ѹ������();
		���㱻��������();
		���㱻��������();
		���㱻��������();
		���㱻��Ĭ����();
		���㱻ѣ������();
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�쳣״̬��Ϣ>");
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", String.format("����Ĭ%b,������%b,������%b,������%b,��ѣ��%b,��ѹ��%b\n", ����Ĭ, ������, ������, ������, ��ѣ��, ��ѹ��));
		if (!��ͨ��������Ч��״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<��ͨ��������Ч��״̬>");
			for (״̬�� ״̬ : ��ͨ��������Ч��״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����ͨ��������Ч��״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����ͨ��������Ч��״̬>");
			for (״̬�� ״̬ : ����ͨ��������Ч��״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����������״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����������״̬>");
			for (״̬�� ״̬ : ����������״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����������״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����������״̬>");
			for (״̬�� ״̬ : ����������״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����ǿ������״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����ǿ������״̬>");
			for (״̬�� ״̬ : ����ǿ������״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����ǿ�ȼ���״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����ǿ�ȼ���״̬>");
			for (״̬�� ״̬ : ����ǿ�ȼ���״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����ֵ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����ֵ����״̬>");
			for (״̬�� ״̬ : ����ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����ֵ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����ֵ����״̬>");
			for (״̬�� ״̬ : ����ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����ֵ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����ֵ����״̬>");
			for (״̬�� ״̬ : ����ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����ֵ��������״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����ֵ��������״̬>");
			for (״̬�� ״̬ : ����ֵ��������״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����ֵ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����ֵ����״̬>");
			for (״̬�� ״̬ : ����ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����ֵ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����ֵ����״̬>");
			for (״̬�� ״̬ : ����ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!�����ٶ�����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�����ٶ�����״̬>");
			for (״̬�� ״̬ : �����ٶ�����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!�����ٶȼ���״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�����ٶȼ���״̬>");
			for (״̬�� ״̬ : �����ٶȼ���״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!ħ����������״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<ħ����������״̬>");
			for (״̬�� ״̬ : ħ����������״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!ħ�����Լ���״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<ħ�����Լ���״̬>");
			for (״̬�� ״̬ : ħ�����Լ���״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!�������ֵ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�������ֵ����״̬>");
			for (״̬�� ״̬ : �������ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!�������ֵ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�������ֵ����״̬>");
			for (״̬�� ״̬ : �������ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����ֵ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����ֵ����״̬>");
			for (״̬�� ״̬ : ����ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����ֵ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����ֵ����״̬>");
			for (״̬�� ״̬ : ����ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!�����ظ�����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�����ظ�����״̬>");
			for (״̬�� ״̬ : �����ظ�����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!�����ظ�����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�����ظ�����״̬>");
			for (״̬�� ״̬ : �����ظ�����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!���״�͸��ֵ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<���״�͸��ֵ����״̬>");
			for (״̬�� ״̬ : ���״�͸��ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!���״�͸�ٷֱ�����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<���״�͸�ٷֱ�����״̬>");
			for (״̬�� ״̬ : ���״�͸�ٷֱ�����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!���״�͸��ֵ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<���״�͸��ֵ����״̬>");
			for (״̬�� ״̬ : ���״�͸��ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!���״�͸�ٷֱȼ���״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<���״�͸�ٷֱȼ���״̬>");
			for (״̬�� ״̬ : ���״�͸�ٷֱȼ���״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!������͸��ֵ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<������͸��ֵ����״̬>");
			for (״̬�� ״̬ : ������͸��ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!������͸��ֵ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<������͸��ֵ����״̬>");
			for (״̬�� ״̬ : ������͸��ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!������͸�ٷֱ�����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<������͸�ٷֱ�����״̬>");
			for (״̬�� ״̬ : ������͸�ٷֱ�����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!������͸�ٷֱȼ���״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<������͸�ٷֱȼ���״̬>");
			for (״̬�� ״̬ : ������͸�ٷֱȼ���״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����͵ȡ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����͵ȡ����״̬>");
			for (״̬�� ״̬ : ����͵ȡ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����͵ȡ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����͵ȡ����״̬>");
			for (״̬�� ״̬ : ����͵ȡ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!������������״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<������������״̬>");
			for (״̬�� ״̬ : ������������״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!�������ʼ���״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�������ʼ���״̬>");
			for (״̬�� ״̬ : �������ʼ���״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!������Ѫ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<������Ѫ����״̬>");
			for (״̬�� ״̬ : ������Ѫ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!������Ѫ����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<������Ѫ����״̬>");
			for (״̬�� ״̬ : ������Ѫ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!��������״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<��������״̬>");
			for (״̬�� ״̬ : ��������״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!���Լ���״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<���Լ���״̬>");
			for (״̬�� ״̬ : ���Լ���״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!��ѹ��״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<��ѹ��״̬>");
			for (״̬�� ״̬ : ��ѹ��״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!�˺�����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�˺�����״̬>");
			for (״̬�� ״̬ : �˺�����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!�����˺�����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�����˺�����״̬>");
			for (״̬�� ״̬ : �����˺�����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!ħ���˺�����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<ħ���˺�����״̬>");
			for (״̬�� ״̬ : ħ���˺�����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!�з���Ӣ����������״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�з���Ӣ����������״̬>");
			for (״̬�� ״̬ : �з���Ӣ����������״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!�з�����״̬������Ӣ��״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�з�Ӣ��״̬������Ӣ��״̬>");
			for (״̬�� ״̬ : �з�����״̬������Ӣ��״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!����״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����״̬>");
			for (״̬�� ״̬ : ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!ħ������״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<ħ������״̬>");
			for (״̬�� ״̬ : ħ������״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!�޵�״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�޵�״̬>");
			for (״̬�� ״̬ : �޵�״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		if (!���������ͷ�״̬����.isEmpty())
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<���������ͷ�״̬>");
			for (״̬�� ״̬ : ���������ͷ�״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}	
		}
		if (��������ʩ��״̬ != null)
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<������������ʩ��>");
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ��������ʩ��״̬.get״̬��Ϣ());
		}
		��������ֵ������������();
		if (is����ֵ��������)
		{
			for (״̬�� ״̬ : ����ֵ��������״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����ֵ��������>");
		}
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<������Ϣ>");
		for (int i = 0; i < ��ս�м�������.length; i++)
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ",String.format("%d�ż��ܣ�����������%s\n��ȴ���ƻغ���%d\n", i+1, ��ս�м�������[i].get��������(), ��ս�м�������[i].getʣ����ȴ�غ���()));
		}
		�����˺���������();
		���������˺���������();
		����ħ���˺���������();
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�˺���������>");
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ",String.format("�˺�����%d|%.1f%%,�����˺�����%d|%.1f%%,ħ���˺�����%d|%.1f%%\n", �˺���ֵ����, �˺��ٷֱȼ��� * 100, �����˺���ֵ����, �����˺��ٷֱȼ��� * 100, ħ���˺���ֵ����, ħ���˺��ٷֱȼ��� * 100));
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<�����������>");
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ",String.format("����:%b,����%b\n", is��ս������(), is��ս������()));
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ",String.format("����ä%b\n", is��ս�б���ä()));
		��������ֵ��������();
		if (is����ֵ����)
		{
			Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", "<����ֵ����>");
			for (״̬�� ״̬ : ����ֵ����״̬����)
			{
				Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ", ״̬.get״̬��Ϣ());
			}
		}
		Gdx.app.debug("��ս��Ӣ����.�����ս��Ӣ����Ϣ",String.format("��ù�����������:%b\n", is��ս�л�ù�����������()));
	}
	private String getӢ������()
	{
		return Ӣ��.getӢ������();
	}
	public static abstract class ����ֵ����״̬�� extends ״̬��
	{
		public ����ֵ����״̬��(int �������غ���)
		{
			super(�������غ���);
		}
		@Override
		public final void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			if (!��״̬����Ӣ��.is����ֵ����)
			{
				��״̬����Ӣ��.is����ֵ���� = true;
			}
		}
	}
	public static abstract class ��ѹ��״̬�� extends ״̬��
	{
		public ��ѹ��״̬��(int �������غ���)
		{
			super(�������غ���);
		}
		@Override
		public final void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			if (!��״̬����Ӣ��.��ѹ��)
			{
				��״̬����Ӣ��.��ѹ�� = true;
			}
		}
	}
	public static abstract class ����ֵ��������״̬�� extends ״̬��
	{
		public ����ֵ��������״̬��(int �������غ���)
		{
			super(�������غ���);
		}
		@Override
		public final void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			if (!��״̬����Ӣ��.is����ֵ��������)
			{
				��״̬����Ӣ��.is����ֵ�������� = true;
			}
		}
	}
	public static abstract class �з�����״̬������Ӣ��״̬�� extends ״̬��
	{
		public �з�����״̬������Ӣ��״̬��(int �������غ���)
		{
			super(�������غ���);
		}
		public abstract void ��֪ͨ�з�����״̬(��ս��Ӣ���� ��֪ͨӢ��, ��ս�������� �з�����);
	}
	public static abstract class ��ͨ��������Ч��״̬�� extends ״̬��
	{
		public ��ͨ��������Ч��״̬��(int �������غ���)
		{
			super(�������غ���);
		}
		public ��ͨ��������Ч��״̬��(int �������غ���, int ������, int ��ʼ����)
		{
			super(�������غ���, ������, ��ʼ����);
		}
		/**
		 * ״̬��������ͨ����ʱ��ʵ�ָ÷������������ǵ�״̬��Ҫ�Ӽ������Ƴ�ʱ�õ�
		 */
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������){}
	}
	public static abstract class ���������ͷ�״̬�� extends ״̬��
	{
		public ���������ͷ�״̬��(int �������غ���) {
			super(�������غ���);
		}
		public void �����ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
		{
			Gdx.app.debug("��ս��Ӣ����.���������ͷ�״̬��.�����ͷ�",String.format("%s���������ͷ�%s\n", �ͷŴ˼��ܵ�Ӣ��.get����������λ��Ӣ������(), get״̬��Ϣ()));
		}
	}
	public static abstract class ��������ʩ��״̬�� extends ״̬��
	{
		public ��������ʩ��״̬��(int �������غ���)
		{
			super(�������غ���);
		}
		public void ����ʩ��(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
		{
			Gdx.app.debug("��ս��Ӣ����.���������ͷ�״̬��.�����ͷ�", String.format("%s��������ʩ��%s\n", �ͷŴ˼��ܵ�Ӣ��.get����������λ��Ӣ������(), get״̬��Ϣ()));
		}
		private void ��������ʩ�������(��ս��Ӣ���� �����Ӣ��)
		{
			�����Ӣ��.��������ʩ��״̬ = null;
			��֪ͨ�����(�����Ӣ��);
		}
		/**
		 * ����ʵ�ָ÷����������ʱ��������
		 */
		protected void ��֪ͨ�����(��ս��Ӣ���� �����Ӣ��)
		{}
	}
	private static class ����״̬�� extends ״̬��
	{
		public ����״̬��(int �������غ���)
		{
			super(�������غ���);
		}
		@Override
		public final void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			if (!��״̬����Ӣ��.is����)
			{
				��״̬����Ӣ��.is���� = true;
			}
		}
		@Override
		public String get״̬����()
		{
			return "����";
		}	
	}
	public static abstract class ����״̬�� extends ״̬��
	{
		public ����״̬��(int �������غ���)
		{
			super(�������غ���);
		}
		@Override
		public final void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			if (!��״̬����Ӣ��.is����)
			{
				��״̬����Ӣ��.is���� = true;
			}
		}
	}
	public static abstract class ����״̬�� extends ״̬��
	{
		private int ����ֵ;
		/**
		 * �����л���ֵ�Ļ���
		 * @param �������غ���
		 * @param ����ֵ ����
		 */
		public ����״̬��(int �������غ���, int ����ֵ) {
			super(�������غ���);
			this.����ֵ = ����ֵ;
		}
		/**
		 * �����޵е��޻���ֵ�û���
		 * @param �������غ���
		 */
		public ����״̬��(int �������غ���)
		{
			super(�������غ���);
		}
		/**
		 * @param �˺� ����
		 * @param ������ �����಻�������˺���Ӽ�����ɾ��
		 * @return ����
		 */
		public int �����˺�(int ����ֵ, int �˺�, Iterator<����״̬��> ������)
		{
			if (����ֵ > �˺�)
			{
				����ֵ -= �˺�;
				return 0;
			}
			else
			{
				������.remove();
				return �˺� - ����ֵ;
			}
		}
	}
	public static abstract class ����ͨ��������Ч��״̬�� extends ״̬��
	{
		public ����ͨ��������Ч��״̬��(int �������غ���)
		{
			super(�������غ���);
		}
		public abstract void ����ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������);
	}
	private static class ��ù�����������״̬�� extends ״̬��
	{
		public ��ù�����������״̬��(int �������غ���)
		{
			super(�������غ���);
		}
		@Override
		public final void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			if (!��״̬����Ӣ��.is��ù�����������)
			{
				��״̬����Ӣ��.is��ù����������� = true;
			}
		}
		@Override
		public String get״̬����()
		{
			return "��ù�����������";
		}
	}
	private static class ����ä״̬�� extends ״̬��
	{
		public ����ä״̬��(int �������غ���)
		{
			super(�������غ���);
		}
		@Override
		public final void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			if (!��״̬����Ӣ��.����ä)
			{
				��״̬����Ӣ��.����ä = true;
			}
		}
		@Override
		public String get״̬����()
		{
			return "����ä";
		}
	}
	public static final class ������״̬�� extends ״̬��
	{
		public static int ���δ�������� = -1;
		private static int ״̬�������ż����� = ���δ�������� + 1;
		private static int get��һ��״̬��������()
		{
			״̬�������ż�����++;
			return ״̬�������ż�����;
		}
		private int ״̬�������� = -1;
		public ������״̬��(int �������غ���) {
			super(�������غ���);
			this.״̬�������� = get��һ��״̬��������();
		}
		@Override
		public final void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			if (��״̬����Ӣ��.��ս�б������� < ״̬��������)
			{
				��״̬����Ӣ��.��ս�б������� = ״̬��������;
			}
		}
		@Override
		public String get״̬����() {
			return "������";
		}
	}
	private class ����Ĭ״̬�� extends ״̬��
	{
		public ����Ĭ״̬��(int �������غ���) {
			super(�������غ���);
		}
		@Override
		public final void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			if (!��״̬����Ӣ��.����Ĭ)
			{
				��״̬����Ӣ��.����Ĭ = true; 
			}
		}
		@Override
		public String get״̬����() {
			return "����Ĭ";
		}
	}
	private class ������״̬�� extends ״̬��
	{
		public ������״̬��(int �������غ���) {
			super(�������غ���);
		}
		@Override
		public final void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			if (!��״̬����Ӣ��.������)
			{
				��״̬����Ӣ��.������ = true;
			}
		}
		@Override
		public String get״̬����() {
			return "������";
		}
	}
	private class ������״̬�� extends ״̬��
	{
		public ������״̬��(int �������غ���) {
			super(�������غ���);
		}
		@Override
		public final void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			if (!��״̬����Ӣ��.������)
			{
				��״̬����Ӣ��.������ = true;
			}
		}
		@Override
		public String get״̬����() {
			return "������";
		}
		
	}
	private class ������״̬�� extends ״̬��
	{
		public ������״̬��(int �������غ���) {
			super(�������غ���);
		}
		@Override
		public final void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			if (!��״̬����Ӣ��.������)
			{
				��״̬����Ӣ��.������ = true;
			}
		}
		@Override
		public String get״̬����() {
			return "������";
		}
	}
	private class ��ѣ��״̬�� extends ״̬��
	{
		public ��ѣ��״̬��(int �������غ���) {
			super(�������غ���);
		}
		@Override
		public final void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			if (!��״̬����Ӣ��.��ѣ��)
			{
				��״̬����Ӣ��.��ѣ�� = true;
			}
		}
		@Override
		public String get״̬����() {
			return "��ѣ��";
		}
	}
	private class ������ä������ extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		private boolean is��ä;
		public ������ä������(boolean is�ҷ�, int Ӣ������λ��, boolean is��ä)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
			this.is��ä = is��ä;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ������ä������(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), is��ä);
		}
	}
	private class ������ä������ extends ������
	{
		private boolean is��ä;
		private Ӣ�������� Ӣ������;
		private ������ä������(Ӣ�������� Ӣ������, boolean is��ä)
		{
			this.is��ä = is��ä;
			this.Ӣ������ = Ӣ������;
		}
		@Override
		public void ��ʼ()
		{
			Ӣ������.set��ä(is��ä);
		}
	}
	private class �������������� extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		private boolean is����;
		public ��������������(boolean is�ҷ�, int Ӣ������λ��, boolean is����)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
			this.is���� = is����;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ������������(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), is����);
		}
	}
	private class ������������ extends ������
	{
		private boolean is����;
		private Ӣ�������� Ӣ������;
		private ������������(Ӣ�������� Ӣ������, boolean is����)
		{
			this.is���� = is����;
			this.Ӣ������ = Ӣ������;
		}
		@Override
		public void ��ʼ()
		{
			Ӣ������.set����(is����);
		}
	}
	private class ����ѹ�������� extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		private boolean isѹ��;
		public ����ѹ��������(boolean is�ҷ�, int Ӣ������λ��, boolean isѹ��)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
			this.isѹ�� = isѹ��;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ����ѹ�ƶ�����(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), isѹ��);
		}
	}
	private class ����ѹ�ƶ����� extends ������
	{
		private boolean isѹ��;
		private Ӣ�������� Ӣ������;
		private ����ѹ�ƶ�����(Ӣ�������� Ӣ������, boolean isѹ��)
		{
			this.isѹ�� = isѹ��;
			this.Ӣ������ = Ӣ������;
		}
		@Override
		public void ��ʼ()
		{
			Ӣ������.setѹ��(isѹ��);
		}
	}
	private class ����ѣ�������� extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		private boolean isѣ��;
		public ����ѣ��������(boolean is�ҷ�, int Ӣ������λ��, boolean isѣ��)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
			this.isѣ�� = isѣ��;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ����ѣ�ζ�����(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), isѣ��);
		}
	}
	private class ����ѣ�ζ����� extends ������
	{
		private boolean isѣ��;
		private Ӣ�������� Ӣ������;
		private ����ѣ�ζ�����(Ӣ�������� Ӣ������, boolean isѣ��)
		{
			this.isѣ�� = isѣ��;
			this.Ӣ������ = Ӣ������;
		}
		@Override
		public void ��ʼ()
		{
			Ӣ������.setѣ��(isѣ��);
		}
	}
	private class ���ó��������� extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		private boolean is����;
		public ���ó���������(boolean is�ҷ�, int Ӣ������λ��, boolean is����)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
			this.is���� = is����;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ���ó�������(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), is����);
		}
	}
	private class ���ó������� extends ������
	{
		private boolean is����;
		private Ӣ�������� Ӣ������;
		private ���ó�������(Ӣ�������� Ӣ������, boolean is����)
		{
			this.is���� = is����;
			this.Ӣ������ = Ӣ������;
		}
		@Override
		public void ��ʼ()
		{
			Ӣ������.set����(is����);
		}
	}
	private class ���û��������� extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		private boolean is����;
		public ���û���������(boolean is�ҷ�, int Ӣ������λ��, boolean is����)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
			this.is���� = is����;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ���û��ɶ�����(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), is����);
		}
	}
	private class ���û��ɶ����� extends ������
	{
		private boolean is����;
		private Ӣ�������� Ӣ������;
		private ���û��ɶ�����(Ӣ�������� Ӣ������, boolean is����)
		{
			this.is���� = is����;
			this.Ӣ������ = Ӣ������;
		}
		@Override
		public void ��ʼ()
		{
			Ӣ������.set����(is����);
		}
	}
	private class ���ó�Ĭ������ extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		private boolean is��Ĭ;
		public ���ó�Ĭ������(boolean is�ҷ�, int Ӣ������λ��, boolean is��Ĭ)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
			this.is��Ĭ = is��Ĭ;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ���ó�Ĭ������(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), is��Ĭ);
		}
	}
	private class ���ó�Ĭ������ extends ������
	{
		private boolean is��Ĭ;
		private Ӣ�������� Ӣ������;
		private ���ó�Ĭ������(Ӣ�������� Ӣ������, boolean is��Ĭ)
		{
			this.is��Ĭ = is��Ĭ;
			this.Ӣ������ = Ӣ������;
		}
		@Override
		public void ��ʼ()
		{
			Ӣ������.set��Ĭ(is��Ĭ);
		}
	}
	private class ���ñ��������� extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		private boolean is����;
		public ���ñ���������(boolean is�ҷ�, int Ӣ������λ��, boolean is����)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
			this.is���� = is����;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ���ñ���������(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), is����);
		}
	}
	private class ���ñ��������� extends ������
	{
		private boolean is����;
		private Ӣ�������� Ӣ������;
		private ���ñ���������(Ӣ�������� Ӣ������, boolean is����)
		{
			this.is���� = is����;
			this.Ӣ������ = Ӣ������;
		}
		@Override
		public void ��ʼ()
		{
			Ӣ������.set����(is����);
		}
	}
	private class ���ü��������� extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		private boolean is����;
		public ���ü���������(boolean is�ҷ�, int Ӣ������λ��, boolean is����)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
			this.is���� = is����;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ���ü�������(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), is����);
		}
	}
	private class ���ü������� extends ������
	{
		private boolean is����;
		private Ӣ�������� Ӣ������;
		private ���ü�������(Ӣ�������� Ӣ������, boolean is����)
		{
			this.is���� = is����;
			this.Ӣ������ = Ӣ������;
		}
		@Override
		public void ��ʼ()
		{
			Ӣ������.set����(is����);
		}
	}
	private static class ��Ѫ������ extends ������
	{
		private int x;
		private int y;
		private int ��ֵ;
		private ��Ѫ������(int x, int y, int ��ֵ)
		{
			this.x = x;
			this.y = y;
			this.��ֵ = ��ֵ;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ��Ѫ������(x, y, ��ֵ);
		}
	}
	private static class ��Ѫ������ extends ������
	{
		private static final int �������� = 10;
		private static final float ����ʱ�� = 0.4f;
		private static final int ���Ҳ�����Χ = 20;
		private static LabelStyle ��Ѫ��ǩ��ʽ;
		private SequenceAction ����Action;
		private ����ƶ�Action ����Action;
		private Label ��Ѫ��ǩ;
		private ��Ѫ������(int x, int y, int ��ֵ)
		{
			if (��Ѫ��ǩ��ʽ == null)
			{
				��Ѫ��ǩ��ʽ = new LabelStyle(����.ʵ��.getUIƤ����Դ().getFont("default"), Color.GREEN);
			}
			MoveByAction ���϶��� = Actions.moveBy(0, ��������, ����ʱ��);
			����Action = new ����ƶ�Action(0, -��������, ����ʱ��);
			����Action = Actions.sequence(���϶���, ����Action);
			float �������ű��� = 1.5f;
			��Ѫ��ǩ = new Label(String.valueOf(��ֵ), ��Ѫ��ǩ��ʽ);
			��Ѫ��ǩ.setFontScale(�������ű���);
			��Ѫ��ǩ.setSize(��Ѫ��ǩ.getWidth() * �������ű���, ��Ѫ��ǩ.getHeight() * �������ű���);
			��Ѫ��ǩ.addAction(����Action);
			��Ѫ��ǩ.setPosition(x - ��Ѫ��ǩ.getWidth() / 2 + ������.�������ֵ(���Ҳ�����Χ * 2) - ���Ҳ�����Χ, y - ��Ѫ��ǩ.getHeight() / 2);
		}
		@Override
		public boolean is���()
		{
			if (����Action.isAction�ѽ���())
			{
				��Ѫ��ǩ.remove();
				return true;
			}
			else
			{
				return false;
			}
		}
		@Override
		public void ��ʼ()
		{
			��ս��Ļ��.ʵ��.�����Ա(��Ѫ��ǩ);
		}
	}
	private static class ��Ѫ������ extends ������
	{
		private int x;
		private int y;
		private int ��ֵ;
		public ��Ѫ������(int x, int y, int ��ֵ)
		{
			this.x = x;
			this.y = y;
			this.��ֵ = ��ֵ;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ��Ѫ������(x, y, ��ֵ);
		}
	}
	private static class ��Ѫ������ extends ������
	{
		private static final int �������� = 10;
		private static final int ���Ҳ�����Χ = 20;
		private static LabelStyle ��Ѫ��ǩ��ʽ;
		private SequenceAction ����Action;
		private ����ƶ�Action ����Action;
		private Label ��Ѫ��ǩ;
		private ��Ѫ������(int x, int y, int ��ֵ)
		{
			if (��Ѫ��ǩ��ʽ == null)
			{
				��Ѫ��ǩ��ʽ = new LabelStyle(����.ʵ��.getUIƤ����Դ().getFont("default"), Color.RED);
			}
			MoveByAction ���϶��� = Actions.moveBy(0, ��������, ����ǰҡ������.��ս����ڶ�ʱ��);
			����Action = new ����ƶ�Action(0, -��������, ����ǰҡ������.��ս����ڶ�ʱ��);
			����Action = Actions.sequence(���϶���, ����Action);
			��Ѫ��ǩ = new Label(String.valueOf(��ֵ), ��Ѫ��ǩ��ʽ);
			float �������ű��� = 1.5f;
			��Ѫ��ǩ.setFontScale(�������ű���);
			��Ѫ��ǩ.setSize(��Ѫ��ǩ.getWidth() * �������ű���, ��Ѫ��ǩ.getHeight() * �������ű���);
			��Ѫ��ǩ.addAction(����Action);
			��Ѫ��ǩ.setPosition(x - ��Ѫ��ǩ.getWidth() / 2 + ������.�������ֵ(���Ҳ�����Χ * 2) - ���Ҳ�����Χ, y - ��Ѫ��ǩ.getHeight() / 2);
		}
		@Override
		public boolean is���()
		{
			if (����Action.isAction�ѽ���())
			{
				��Ѫ��ǩ.remove();
				return true;
			}
			else
			{
				return false;
			}
		}
		@Override
		public void ��ʼ()
		{
			��ս��Ļ��.ʵ��.�����Ա(��Ѫ��ǩ);
		}
	}
	private static class �������ζ������� extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		public �������ζ�������(boolean is�ҷ�, int Ӣ������λ��)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �������ζ�������(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), is�ҷ�);
		}
	}
	private static class �������ζ������� extends ������
	{
		private static final int �ζ����� = 10;
		private static final float ����ζ�ʱ�� = 0.3f;
		private Actor Ӣ��ͼƬ;
		private SequenceAction �ζ�Action;
		private ����ƶ�Action �λ�Action;
		public �������ζ�������(Actor Ӣ��ͼƬ, boolean is�ҷ�)
		{
			this.Ӣ��ͼƬ = Ӣ��ͼƬ;
			MoveByAction ���϶��� = Actions.moveBy(0, is�ҷ� ? -�ζ����� : �ζ�����, ����ζ�ʱ�� / 2);
			�λ�Action = new ����ƶ�Action(0, is�ҷ� ? �ζ����� : -�ζ�����, ����ζ�ʱ�� / 2);
			�ζ�Action = Actions.sequence(���϶���, �λ�Action);
		}
		@Override
		public boolean is���()
		{
			if (�λ�Action.isAction�ѽ���())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		@Override
		public void ��ʼ()
		{
			Ӣ��ͼƬ.addAction(�ζ�Action);
		}
	}
	private static class Ӣ������������ extends ������
	{
		private int ���˻�ɱ��;
		private boolean is�ҷ�����;
		private int λ��;
		private String ��Ч�ļ���;
		public Ӣ������������(int ���˻�ɱ��, boolean is�ҷ�����, int λ��, String ��Ч�ļ���)
		{
			this.���˻�ɱ�� = ���˻�ɱ��;
			this.is�ҷ����� = is�ҷ�����;
			this.λ�� = λ��;
			this.��Ч�ļ��� = ��Ч�ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new Ӣ������������(���˻�ɱ��, is�ҷ�����, λ��, ��Ч�ļ���);
		}
	}
	private static class Ӣ������������ extends ������
	{
		private ����ƶ�Action �ƶ�Action = new ����ƶ�Action(0, 100, 0.6f);
		private ������Ա�� ����ͷ����;
		private boolean is�ҷ�����;
		private int λ��;
		private Music ��ɱ��Ч;
		private Music ������Ч;
		private Ӣ������������(int ���˻�ɱ��, boolean is�ҷ�����, int λ��, String ��Ч�ļ���)
		{
			this.is�ҷ����� = is�ҷ�����;
			this.λ�� = λ��;
			if (!is�ҷ�����)
			{
				if (���˻�ɱ�� > 1)
				{
					��ɱ��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "Kill" + (char)(���˻�ɱ��-1+'A') + ".mp3"));
					��ɱ��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
				}
			}
			else
			{
				������Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + ��Ч�ļ���));
				������Ч.setOnCompletionListener(new ���ֲ������Զ�������());
			}
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "BattleScreenSkull.p"), ��ս��Ļ��.ʵ��.getƤ����Դ().getAtlas());
			����ͷ���� = new ������Ա��(����Ч��);
			if (is�ҷ�����)
			{
				����ͷ����.setPosition(��ս��Ļ��.�ҷ�X��������[λ��], ��ս��Ļ��.�ҷ�Y��������[λ��]);
			}
			else
			{
				����ͷ����.setPosition(��ս��Ļ��.�з�X��������[λ��], ��ս��Ļ��.�з�Y��������[λ��]);
			}
			����ͷ����.addAction(�ƶ�Action);
		}
		@Override
		public boolean is���()
		{
			if (�ƶ�Action.isAction�ѽ���())
			{
				��ս��Ļ��.ʵ��.��֪ͨӢ������(is�ҷ�����, λ��);
				����ͷ����.remove();
				return true;
			}
			else
			{
				return false;
			}
		}
		@Override
		public void ��ʼ()
		{
			if (������Ч != null)
			{
				������Ч.play();
			}
			if (��ɱ��Ч != null)
			{
				��ɱ��Ч.play();
			}
			��ս��Ļ��.ʵ��.�����Ա(����ͷ����);
		}
	}
	/**
	 * ���캯��
	 * @param Ӣ������λ�� 1��Ϊ1���Դ�����
	 */
	public ��ս��Ӣ���� (boolean is�ҷ�, Ӣ���� Ӣ��, ��ս�������� ��������, int Ӣ������λ��)
	{
		this.�������� = ��������;
		this.Ӣ������λ�� = Ӣ������λ��;
		this.Ӣ�� = Ӣ��;
		this.is�ҷ� = is�ҷ�;
		��ս��Ӣ������ = new Ӣ��������();
		������[] �������� = Ӣ��.get��������();
		��ս�м������� = new ��ս�м�����[��������.length];
		for (int i = 0; i < ��������.length; i++)
		{
			��ս�м�������[i] = new ��ս�м�����(��������[i]);
		}
		����ֵ = Ӣ��.getӢ������().get�������ֵ();
	}
	public boolean is�ҷ�()
	{
		return is�ҷ�;
	}
	public void ��ӱ���״̬()
	{
		Ӣ��.��ӱ���״̬(this);
	}
	/**
	 * �����Ϣ����debug
	 */
	public String get����������λ��Ӣ������()
	{
		return String.format("<%s��%d��λӢ��%s>", get��������().get������(), getӢ������λ��(), getӢ������());
	}
	public void ��֪ͨ�з�������Ӣ������()
	{
		for (״̬�� ״̬ : �з���Ӣ����������״̬����)
		{
			״̬.����(this);
		}
	}
	public void ��֪ͨ�з�����״̬(��ս�������� �з�����)
	{
		for (�з�����״̬������Ӣ��״̬�� ״̬ : �з�����״̬������Ӣ��״̬����)
		{
			״̬.��֪ͨ�з�����״̬(this, �з�����);
		}
	}
	public boolean �ͷ���������ʩ��(��ս�������� �з�����)
	{
		if (��������ʩ��״̬ != null)
		{
			��������ʩ��״̬.����ʩ��(�з�����, this);
			return true;
		}
		else
		{
			return false;
		}
	}
	public void ���������ͷ�״̬�ͷ�(��ս�������� �з�����)
	{
		for (���������ͷ�״̬�� ״̬ : ���������ͷ�״̬����)
		{
			״̬.�����ͷ�(�з�����, this);
		}
	}
	public void ��ӹ�������ֵ�仯(int ��ֵ�仯)
	{
		Ӣ�����Ա仯.��ӹ�������ֵ�仯(��ֵ�仯);
	}
	public void ��ӹ������ٷֱȱ仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.��ӹ������ٷֱȱ仯(�ٷֱȱ仯);
	}
	public void ��ӷ���ǿ����ֵ�仯(int ��ֵ�仯)
	{
		Ӣ�����Ա仯.��ӷ���ǿ����ֵ�仯(��ֵ�仯);
	}
	public void ��ӷ���ǿ�Ȱٷֱȱ仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.��ӷ���ǿ�Ȱٷֱȱ仯(�ٷֱȱ仯);
	}
	public void �������ֵ��ֵ�仯(int ��ֵ�仯)
	{
		Ӣ�����Ա仯.�������ֵ��ֵ�仯(��ֵ�仯);
	}
	public void �������ֵ�ٷֱȱ仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.�������ֵ�ٷֱȱ仯(�ٷֱȱ仯);
	}
	public void ��ӻ�����ֵ�仯(int ��ֵ�仯)
	{
		Ӣ�����Ա仯.��ӻ�����ֵ�仯(��ֵ�仯);
	}
	public void ��ӻ��װٷֱȱ仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.��ӻ��װٷֱȱ仯(�ٷֱȱ仯);
	}
	public void ��ӹ����ٶȰٷֱȱ仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.��ӹ����ٶȰٷֱȱ仯(�ٷֱȱ仯);
	}
	public void ���ħ��������ֵ�仯(int ��ֵ�仯)
	{
		Ӣ�����Ա仯.���ħ��������ֵ�仯(��ֵ�仯);
	}
	public void ���ħ�����԰ٷֱȱ仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.���ħ�����԰ٷֱȱ仯(�ٷֱȱ仯);
	}
	public void ����������ֵ��ֵ�仯(int ��ֵ�仯)
	{
		Ӣ�����Ա仯.����������ֵ��ֵ�仯(��ֵ�仯);
	}
	public void ����������ֵ�ٷֱȱ仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.����������ֵ�ٷֱȱ仯(�ٷֱȱ仯);
	}
	public void ��������ظ���ֵ�仯(int ��ֵ�仯)
	{
		Ӣ�����Ա仯.��������ظ���ֵ�仯(��ֵ�仯);
	}
	public void ��������ظ��ٷֱȱ仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.��������ظ��ٷֱȱ仯(�ٷֱȱ仯);
	}
	public void �����ֵ���״�͸�仯(int ��ֵ�仯)
	{
		Ӣ�����Ա仯.�����ֵ���״�͸�仯(��ֵ�仯);
	}
	public void ��ӰٷֱȻ��״�͸�仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.��ӰٷֱȻ��״�͸�仯(�ٷֱȱ仯);
	}
	public void �����ֵ������͸�仯(int ��ֵ�仯)
	{
		Ӣ�����Ա仯.�����ֵ������͸�仯(��ֵ�仯);
	}
	public void ��Ӱٷֱȷ�����͸�仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.��Ӱٷֱȷ�����͸�仯(�ٷֱȱ仯);
	}
	public void �������͵ȡ�ٷֱȱ仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.�������͵ȡ�ٷֱȱ仯(�ٷֱȱ仯);
	}
	public void ��ӱ������ʰٷֱȱ仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.��ӱ������ʰٷֱȱ仯(�ٷֱȱ仯);
	}
	public void ��ӷ�����Ѫ�ٷֱȱ仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.��ӷ�����Ѫ�ٷֱȱ仯(�ٷֱȱ仯);
	}
	public void ������԰ٷֱȱ仯(float �ٷֱȱ仯)
	{
		Ӣ�����Ա仯.������԰ٷֱȱ仯(�ٷֱȱ仯);
	}
	/**
	 * @param ���� ����
	 */
	public void ����˺���ֵ����(int ����)
	{
		�˺���ֵ���� += ����;
	}
	/**
	 * @param ���� ����
	 */
	public void ����˺��ٷֱȼ���(float ����)
	{
		�˺��ٷֱȼ��� += ����;
	}
	/**
	 * @param ���� ����
	 */
	public void ��������˺���ֵ����(int ����)
	{
		�����˺���ֵ���� += ����;
	}
	/**
	 * @param ���� ����
	 */
	public void ��������˺��ٷֱȼ���(float ����)
	{
		�����˺��ٷֱȼ��� += ����;
	}
	/**
	 * @param ���� ����
	 */
	public void ���ħ���˺���ֵ����(int ����)
	{
		ħ���˺���ֵ���� += ����;
	}
	/**
	 * @param ���� ����
	 */
	public void ���ħ���˺��ٷֱȼ���(float ����)
	{
		ħ���˺��ٷֱȼ��� += ����;
	}
	public void ������(int ����������غ���, ���������� ��������)
	{
		������״̬����.add(new ������״̬��(����������غ���));
		if (�������� == null)
		{
			������װ����.ʵ��.�������(new ���ü���������(is�ҷ�, Ӣ������λ��, is��ս�б�����()));
		}
		else
		{
			��������.�������(new ���ü���������(is�ҷ�, Ӣ������λ��, is��ս�б�����()));
		}
	}
	public boolean is���ڳ���ʩ��()
	{
		return ��������ʩ��״̬ != null;
	}
	public boolean is��ս�б�����()
	{
		return get��ս�б�������() > ������״̬��.���δ��������;
	}
	public boolean is��ս�б���Ĭ() {
		���㱻��Ĭ����();
		return ����Ĭ;
	}
	public boolean is��ս�б�����() {
		���㱻��������();
		return ������;
	}
	public boolean is��ս�б�����() {
		���㱻��������();
		return ������;
	}
	public boolean is��ս�б�����() {
		���㱻��������();
		return ������;
	}
	public boolean is��ս�б�ѣ��() {
		���㱻ѣ������();
		return ��ѣ��;
	}
	public boolean is��ս�б�ѹ��()
	{
		���㱻ѹ������();
		return ��ѹ��;
	}
	public boolean is����() {
		return ����;
	}
	public boolean is��ս�л�ù�����������()
	{
		�����ù�����������();
		return is��ù�����������;
	}
	private boolean is��ս�б���ä()
	{
		���㱻��ä����();
		return ����ä;
	}
	private boolean is��ս������ֵ����()
	{
		��������ֵ��������();
		return is����ֵ����;
	}
	public boolean is��ս������()
	{
		������������();
		������������();
		���㱻������();
		return is���� && !is���� && ��ս�б������� <= ������״̬��.���δ��������; 
	}
	public Ӣ���� getӢ��()
	{
		return Ӣ��;
	}
	/**
	 * 1-5
	 */
	public int getӢ������λ��() {
		return Ӣ������λ��;
	}
	public ��ս�������� get��������()
	{
		return ��������;
	}
	public int get��ս�л���ֵ()
	{
		���㻤��ֵ();
		return ��ս��Ӣ������.get����ֵ();
	}
	public int get��ս������ֵ()
	{
		return ����ֵ;
	}
	public int get��ս���������ֵ()
	{
		�����������ֵ();
		return ��ս��Ӣ������.get�������ֵ();
	}
	/**
	 * ���ݹ����ٶȼ��㱾�غϹ�������
	 */
	public int get��ս�й����ܴ���()
	{
		���㹥���ٶ�();
		return ������.����_�����ٶ�_���㹥���ܴ���(��ս��Ӣ������.get�����ٶ�());
	}
	public int get��ս������ֵ()
	{
		��������ֵ();
		return ��ս��Ӣ������.get����ֵ();
	}
	public int get��ս����ֵ������͸()
	{
		������ֵ������͸();
		return ��ս��Ӣ������.get��ֵ������͸();
	}
	public int get��ս����ֵ���״�͸()
	{
		������ֵ���״�͸();
		return ��ս��Ӣ������.get��ֵ���״�͸();
	}
	public float get��ս�аٷֱȷ�����͸()
	{
		����ٷֱȷ�����͸();
		return ��ս��Ӣ������.get�ٷֱȷ�����͸();
	}
	public float get��ս�аٷֱȻ��״�͸()
	{
		����ٷֱȻ��״�͸();
		return ��ս��Ӣ������.get�ٷֱȻ��״�͸();
	}
	public float get��ս�з�����Ѫ()
	{
		���㷨����Ѫ();
		return ��ս��Ӣ������.get������Ѫ();
	}
	public int get��ս�й�����()
	{
		���㹥����();
		return ��ս��Ӣ������.get������();
	}
	public float get��ս�б�������()
	{
		���㱩������();
		return ��ս��Ӣ������.get��������();
	}
	public int get��ս�з���ǿ��()
	{
		���㷨��ǿ��();
		return ��ս��Ӣ������.get����ǿ��();
	}
	public int get��ս�б�������()
	{
		���㱻������();
		return ��ս�б�������;
	}
	public int get��ʼ�������ֵ()
	{
		return Ӣ��.getӢ������().get�������ֵ();
	}
	public float get��ʼ�����ٶ�()
	{
		return Ӣ��.getӢ������().get�����ٶ�();
	}
	public int get��ʼ����ֵ()
	{
		return Ӣ��.getӢ������().get����ֵ();
	}
	public int get��ʼ��ֵ������͸()
	{
		return Ӣ��.getӢ������().get��ֵ������͸();
	}
	public int get��ʼ��ֵ���״�͸()
	{
		return Ӣ��.getӢ������().get��ֵ���״�͸();
	}
	public float get��ʼ�ٷֱȷ�����͸()
	{
		return Ӣ��.getӢ������().get�ٷֱȷ�����͸();
	}
	public float get��ʼ�ٷֱȻ��״�͸()
	{
		return Ӣ��.getӢ������().get�ٷֱȻ��״�͸();
	}
	public float get��ʼ������Ѫ()
	{
		return Ӣ��.getӢ������().get������Ѫ();
	}
	public int get��ʼ������()
	{
		return Ӣ��.getӢ������().get������();
	}
	public float get��ʼ��������()
	{
		return Ӣ��.getӢ������().get��������();
	}
	public int get��ʼ����ǿ��()
	{
		return Ӣ��.getӢ������().get����ǿ��();
	}
	public int get��ʼħ������()
	{
		return Ӣ��.getӢ������().getħ������();
	}
	public float get��ʼ����͵ȡ()
	{
		return Ӣ��.getӢ������().get����͵ȡ();
	}
	public float get��ʼ����()
	{
		return Ӣ��.getӢ������().get����();
	}
	public int get��ʼ����ֵ()
	{
		return Ӣ��.getӢ������().get����ֵ();
	}
	public int get��ʼ�����ظ�()
	{
		return Ӣ��.getӢ������().get�����ظ�();
	}
	public ״̬�� getħ�����Լ���״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, ħ�����Լ���״̬����);
	}
	public ״̬�� getħ����������״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, ħ����������״̬����);
	}
	public ״̬�� get��ͨ��������Ч��״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, ��ͨ��������Ч��״̬����);
	}
	public ״̬�� get����ͨ��������Ч��״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, ����ͨ��������Ч��״̬����);
	}
	public ״̬�� get����ֵ����״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, ����ֵ����״̬����);
	}
	public ״̬�� get�����ٶ�����״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, �����ٶ�����״̬����);
	}
	public ״̬�� get����ֵ��������״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, ����ֵ��������״̬����);
	}
	public ״̬�� get����ֵ����״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, ����ֵ����״̬����);
	}
	public ״̬�� get�˺�����״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, �˺�����״̬����);
	}
	public ״̬�� get����״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, ����״̬����);
	}
	public ״̬�� get���׼���״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, ����ֵ����״̬����);
	}
	public ״̬�� get����״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, ����״̬����);
	}
	public ״̬�� get������Ѫ����״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, ������Ѫ����״̬����);
	}
	public ״̬�� get����ǿ������״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, ����ǿ������״̬����);
	}
	public ״̬�� get����ֵ����״̬(Class<? extends ״̬��> clazz)
	{
		return get״̬(clazz, ����ֵ����״̬����);
	}
	private ״̬�� get״̬(Class<? extends ״̬��> clazz, Set<? extends ״̬��> ״̬����)
	{
		for (״̬�� ״̬ : ״̬����)
		{
			if (״̬.getClass() == clazz)
			{
				return ״̬;
			}
		}
		return null;
	}
	/**
	 * @param �����������˺�
	 * @param ��ֵ���״�͸
	 * @param �ٷֱȻ��״�͸
	 * @param �������� ��Ϊnull����ֱ����ӵ���ս��Ļ������ 
	 * @return
	 */
	public int ����������˺�(��ս��Ӣ���� �����ͷ���, int �����������˺�, int ��ֵ���״�͸, float �ٷֱȻ��״�͸, ���������� ��������)
	{
		���㻤��ֵ();
		int ������˺�ʱ����ֵ = ������.����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(��ս��Ӣ������.get����ֵ(), ��ֵ���״�͸, �ٷֱȻ��״�͸);
		float ���������˺��ٷֱȼ��� = ������.����_��ֵ_����ٷֱȼ���(������˺�ʱ����ֵ);
		int �����˺� = ������.����_�ٷֱȱ仯_����ֵ(�����������˺�, ���������˺��ٷֱȼ���);
		�����˺���������();
		���������˺���������();
		�����˺� = ������.����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(�����˺�, -�˺���ֵ����, -�˺��ٷֱȼ���);
		�����˺� = ������.����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(�����˺�, -�����˺���ֵ����, -�����˺��ٷֱȼ���);
		int �������պ��˺� = �����˺�;
		Iterator<����״̬��> ���ܵ����� = �޵�״̬����.iterator();
		while (���ܵ�����.hasNext())
		{
			�������պ��˺� = ���ܵ�����.next().�����˺�(����ֵ, �������պ��˺�, ���ܵ�����);
		}
		���ܵ����� = ����״̬����.iterator();
		while (���ܵ�����.hasNext())
		{
			�������պ��˺� = ���ܵ�����.next().�����˺�(����ֵ, �������պ��˺�, ���ܵ�����);
		}
		Gdx.app.debug("��ս��Ӣ����.����������˺�",String.format("%s����������˺������ܼ���%d\n", get����������λ��Ӣ������(), �����˺� - �������պ��˺�));
		return ��������ֵ(�����ͷ���, -�������պ��˺�, ��������);
	}
	/**
	 * @param ������ħ���˺� ����
	 * @param ��ֵ������͸ ����
	 * @param �ٷֱȷ�����͸ ����
	 * @param ���ж��� ��Ϊnull����ֱ����ӵ���ս��Ļ������ 
	 * @return ʵ������˺�
	 */
	public int �����ħ���˺�(��ս��Ӣ���� �����ͷ���, int ������ħ���˺�, int ��ֵ������͸, float �ٷֱȷ�����͸, ���������� ��������)
	{
		����ħ������();
		int ������˺�ʱħ������ = ������.����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(��ս��Ӣ������.getħ������(), ��ֵ������͸, �ٷֱȷ�����͸);
		float ħ��ħ���˺��ٷֱȼ��� = ������.����_��ֵ_����ٷֱȼ���(������˺�ʱħ������);
		int �����˺� = ������.����_�ٷֱȱ仯_����ֵ(������ħ���˺�, ħ��ħ���˺��ٷֱȼ���);
		�����˺���������();
		����ħ���˺���������();
		�����˺� = ������.����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(�����˺�, -�˺���ֵ����, -�˺��ٷֱȼ���);
		�����˺� = ������.����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(�����˺�, -ħ���˺���ֵ����, -ħ���˺��ٷֱȼ���);
		int �������պ��˺� = �����˺�;
		Iterator<����״̬��> ���ܵ����� = �޵�״̬����.iterator();
		while (���ܵ�����.hasNext())
		{
			�������պ��˺� = ���ܵ�����.next().�����˺�(����ֵ, �������պ��˺�, ���ܵ�����);
		}
		���ܵ����� = ����״̬����.iterator();
		while (���ܵ�����.hasNext())
		{
			�������պ��˺� = ���ܵ�����.next().�����˺�(����ֵ, �������պ��˺�, ���ܵ�����);
		}
		int ���������˺� = �����˺� - �������պ��˺�;
		int ħ���������պ��˺� = �������պ��˺�;
		���ܵ����� = ħ������״̬����.iterator();
		while (���ܵ�����.hasNext())
		{
			ħ���������պ��˺� = ���ܵ�����.next().�����˺�(����ֵ, ħ���������պ��˺�, ���ܵ�����);
		}
		int ħ�����������˺� = �������պ��˺� - ħ���������պ��˺�;
		Gdx.app.debug("��ս��Ӣ����.�����ħ���˺�",String.format("%s�����ħ���˺������ܼ���%d��ħ�����ܼ���%d\n",  get����������λ��Ӣ������(), ���������˺�, ħ�����������˺�));
		return ��������ֵ(�����ͷ���, -ħ���������պ��˺�, ��������);
	}
	/**
	 * @param ��������ʵ�˺� ����
	 * @param ���ж��� ��Ϊnull����ֱ����ӵ���ս��Ļ������ 
	 */
	public void �������ʵ�˺�(��ս��Ӣ���� �����ͷ���, int ��������ʵ�˺�, ���������� ��������)
	{
		int �������պ��˺� = ��������ʵ�˺�;
		Iterator<����״̬��> ���ܵ����� = �޵�״̬����.iterator();
		while (���ܵ�����.hasNext())
		{
			�������պ��˺� = ���ܵ�����.next().�����˺�(����ֵ, �������պ��˺�, ���ܵ�����);
		}
		���ܵ����� = ����״̬����.iterator();
		while (���ܵ�����.hasNext())
		{
			�������պ��˺� = ���ܵ�����.next().�����˺�(����ֵ, �������պ��˺�, ���ܵ�����);
		}
		Gdx.app.debug("��ս��Ӣ����.�������ʵ�˺�",String.format("%s�������ʵ�˺������ܼ���%d����������%d\n", get����������λ��Ӣ������(), ��������ʵ�˺� - �������պ��˺�, �������պ��˺�));
		��������ֵ(�����ͷ���, -�������պ��˺�, ��������);
	}
	/**
	 * ���ø÷�����֮ʱ���ѹ�һ�غ�
	 */
	public void ��֪ͨʱ���ѹ�һ�غ�()
	{
		// ֪ͨ����״̬ʱ���ѹ�һ�غ�
		// ��Ϊ������״̬��Ҫ�Ӽ������Ƴ�������Ҫ�õ�������
		Iterator<? extends ״̬��> ������ = ����������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = �з���Ӣ����������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����ǿ������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����ǿ�ȼ���״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����ֵ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����ֵ��������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����ֵ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����ֵ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����ֵ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = �����ٶ�����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = �����ٶȼ���״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ħ����������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ħ�����Լ���״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = �������ֵ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = �������ֵ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����ֵ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����ֵ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = �����ظ�����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = �����ظ�����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ���״�͸��ֵ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ���״�͸�ٷֱ�����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ���״�͸��ֵ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ���״�͸�ٷֱȼ���״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ������͸��ֵ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ������͸�ٷֱ�����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ������͸��ֵ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ������͸�ٷֱȼ���״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����͵ȡ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����͵ȡ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ������������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = �������ʼ���״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ������Ѫ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ������Ѫ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		// �������Բ������ڱ���Ĭ���������������ɡ���������ѣ��״̬
		// �ȼ���������֪ͨ����״̬ʱ���ѹ�һ�غ�
		��������();
		float ���� = ��ս��Ӣ������.get����();
		������ = ����Ĭ״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������, ����);
		}
		������ = ������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������, ����);
		}
		������ = ������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������, ����);
		}
		������ = ������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������, ����);
		}
		������ = ��ѣ��״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������, ����);
		}
		������ = ��ѹ��״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������, ����);
		}
		������ = ��������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ���Լ���״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = �˺�����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = �����˺�����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ħ���˺�����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����ֵ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����ä״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ��ù�����������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		// ֪ͨ���м���ʱ���ѹ�һ�غ�
		for (int i = 0; i < ��ս�м�������.length; i++)
		{
			��ս�м�������[i].֪ͨʱ���ѹ�һ�غ�();
		}
		if (��������ʩ��״̬ != null)
		{
			��������ʩ��״̬ = (��������ʩ��״̬��)��������ʩ��״̬.��֪ͨʱ���Ѿ���һ�غ�();
		}
		������ = ���������ͷ�״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ��ͨ��������Ч��״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����ͨ��������Ч��״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ����״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = ħ������״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = �޵�״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
		������ = �з�����״̬������Ӣ��״̬����.iterator();
		while (������.hasNext())
		{
			������.next().��֪ͨʱ���Ѿ���һ�غ�(������);
		}
	}
	/**
	 * �˺����ٰٷֱ���ָ�����ͨ�������������ٰٷֱȣ������޼���ʥ��˫�ش���ĵ����¹������ӵ��˺���Ҫ����50%
	 * @param �з�Ӣ��
	 * @param ���������ٰٷֱ� ����
	 * @param is��ͨ��������Ч�� ��ͨ�����Ƿ񴥷�Ч��
	 */
	public void ��ͨ����(��ս��Ӣ���� �з�Ӣ��, float ���������ٰٷֱ�, boolean is��ͨ��������Ч��, boolean is�����ι���)
	{
		if (is��ս�б���ä())
		{
			Gdx.app.debug("��ս��Ӣ����.��ͨ����",String.format("%s����ä����ͨ����δ����\n", get����������λ��Ӣ������()));
		}
		else
		{
			int ������ = ������.����_�ٷֱȱ仯_����ֵ(get��ս�й�����(), -���������ٰٷֱ�);
			���������� �������� = new ����������();
			// ��������򹥻�������
			if (������.����_����_�����Ƿ���(get��ս�б�������()))
			{
				��������.�������(new ״̬�ı���ʾ������(is�ҷ�, Ӣ������λ��, "����", true));
				������ *= 2;
			}
			Gdx.app.debug("��ս��Ӣ����.��ͨ����",String.format("%s��%s��ͨ����\n",  get����������λ��Ӣ������(), �з�Ӣ��.get����������λ��Ӣ������()));
			��������.�������(new ����ǰҡ������(is�ҷ�, Ӣ������λ��, is�����ι���, is�ҷ�));
			if (is�ҷ�)
			{
				��������.�������(Ӣ��.get��ͨ��������(��ս��Ļ��.�ҷ�X��������[Ӣ������λ��-1], ��ս��Ļ��.�ҷ�Y��������[Ӣ������λ��-1], ��ս��Ļ��.�з�X��������[�з�Ӣ��.Ӣ������λ��-1], ��ս��Ļ��.�з�Y��������[�з�Ӣ��.Ӣ������λ��-1], is�����ι���, Ӣ��.getӢ��Ƥ���ļ���(), this));
			}
			else
			{
				��������.�������(Ӣ��.get��ͨ��������(��ս��Ļ��.�з�X��������[Ӣ������λ��-1], ��ս��Ļ��.�з�Y��������[Ӣ������λ��-1], ��ս��Ļ��.�ҷ�X��������[�з�Ӣ��.Ӣ������λ��-1], ��ս��Ļ��.�ҷ�Y��������[�з�Ӣ��.Ӣ������λ��-1], is�����ι���, Ӣ��.getӢ��Ƥ���ļ���(), this));
			}
			int �з�Ӣ������ʵ���˺� = 0;
			if (Ӣ��.is��ս(this))
			{
				�з�Ӣ������ʵ���˺� = �з�Ӣ��.����������˺�(this, ������, get��ս����ֵ���״�͸(), get��ս�аٷֱȻ��״�͸(), ��������);
				������װ����.ʵ��.�������(��������);
			}
			else
			{
				������װ����.ʵ��.�������(��������);
				�з�Ӣ������ʵ���˺� = �з�Ӣ��.����������˺�(this, ������, get��ս����ֵ���״�͸(), get��ս�аٷֱȻ��״�͸(), null);
			}
			����͵ȡ(�з�Ӣ������ʵ���˺�);
			if (!�з�Ӣ��.is����())
			{
				Iterator<����ͨ��������Ч��״̬��> ����ͨ��������Ч�������� = �з�Ӣ��.����ͨ��������Ч��״̬����.iterator();
				while (����ͨ��������Ч��������.hasNext())
				{
					����ͨ��������Ч��������.next().����ͨ����(this, �з�Ӣ��);
				}
			}
		}
		if (is��ͨ��������Ч�� && !����)
		{
			Iterator<��ͨ��������Ч��״̬��> ��ͨ��������Ч�������� = ��ͨ��������Ч��״̬����.iterator();
			while (��ͨ��������Ч��������.hasNext())
			{
				if (!�з�Ӣ��.is����())
				{
					��ͨ��������Ч��������.next().��ͨ����(this, �з�Ӣ��, ��ͨ��������Ч��������);
				}
				else
				{
					break;
				}
			}
		}
	}
	/**
	 * @param �Եз���ɵ��˺� ����
	 */
	public void ����͵ȡ(int �Եз���ɵ��˺�)
	{
		��������͵ȡ();
		�Եз���ɵ��˺� *= ��ս��Ӣ������.get����͵ȡ();
		Gdx.app.debug("��ս��Ӣ����.����͵ȡ",String.format("%s����͵ȡ%d\n",  get����������λ��Ӣ������(), �Եз���ɵ��˺�));
		��������ֵ(�Եз���ɵ��˺�, null);
	}
	/**
	 * @param �Եз���ɵ��˺� ����
	 * @param isȺ���˺�
	 */
	public void ������Ѫ(int �Եз���ɵ��˺�, boolean isȺ���˺�)
	{
		���㷨����Ѫ();
		�Եз���ɵ��˺� *= ��ս��Ӣ������.get������Ѫ();
		if (isȺ���˺�)
		{
			�Եз���ɵ��˺� *= 1f/3;
		}
		Gdx.app.debug("��ս��Ӣ����.������Ѫ",String.format("%s%s��������Ѫ%d\n",  get����������λ��Ӣ������(), isȺ���˺� ? "Ⱥ���˺���Ѫ��Ϊ1/3" : "", �Եз���ɵ��˺�));
		��������ֵ(�Եз���ɵ��˺�, null);
	}
	public void �仯����ֵ()
	{
		for (״̬�� ״̬ : ����ֵ����״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : ����ֵ����״̬����)
		{
			״̬.����(this);
		}
	}
	public void �ظ�����(���������� ���л�Ѫ����)
	{
		���������ظ�();
		Gdx.app.debug("��ս��Ӣ����.�ظ�����",String.format("%s�ظ�����ֵ\n",  get����������λ��Ӣ������()));
		��������ֵ(��ս��Ӣ������.get�����ظ�(), ���л�Ѫ����);
	}
	public void ��ӹ���������״̬(״̬�� ״̬)
	{
		����������״̬����.add(״̬);
	}
	public void ��ӹ���������״̬(״̬�� ״̬)
	{
		����������״̬����.add(״̬);
	}
	public void ��ӷ���ǿ������״̬(״̬�� ״̬)
	{
		����ǿ������״̬����.add(״̬);
	}
	public void ��ӷ���ǿ�ȼ���״̬(״̬�� ״̬)
	{
		����ǿ�ȼ���״̬����.add(״̬);
	}
	public void �������ֵ����״̬(״̬�� ״̬)
	{
		����ֵ����״̬����.add(״̬);
	}
	public void �������ֵ��������״̬(����ֵ��������״̬�� ״̬)
	{
		����ֵ��������״̬����.add(״̬);
	}
	public void �������ֵ����״̬(״̬�� ״̬)
	{
		����ֵ����״̬����.add(״̬);
	}
	public void ��ӻ���ֵ����״̬(״̬�� ״̬)
	{
		����ֵ����״̬����.add(״̬);
	}
	public void ��ӻ���ֵ����״̬(״̬�� ״̬)
	{
		����ֵ����״̬����.add(״̬);
	}
	public void ��ӹ����ٶ�����״̬(״̬�� ״̬)
	{
		�����ٶ�����״̬����.add(״̬);
	}
	public void ��ӹ����ٶȼ���״̬(״̬�� ״̬)
	{
		�����ٶȼ���״̬����.add(״̬);
	}
	public void ���ħ����������״̬(״̬�� ״̬)
	{
		ħ����������״̬����.add(״̬);
	}
	public void ���ħ�����Լ���״̬(״̬�� ״̬)
	{
		ħ�����Լ���״̬����.add(״̬);
	}
	public void ����������ֵ����״̬(״̬�� ״̬)
	{
		�������ֵ����״̬����.add(״̬);
	}
	public void ����������ֵ����״̬(״̬�� ״̬)
	{
		�������ֵ����״̬����.add(״̬);
	}
	public void �������ֵ����״̬(״̬�� ״̬)
	{
		����ֵ����״̬����.add(״̬);
	}
	public void �������ֵ����״̬(״̬�� ״̬)
	{
		����ֵ����״̬����.add(״̬);
	}
	public  void ��������ظ�����״̬(״̬�� ״̬)
	{
		�����ظ�����״̬����.add(״̬);
	}
	public  void ��������ظ�����״̬(״̬�� ״̬)
	{
		�����ظ�����״̬����.add(״̬);
	}
	public void ��ӻ��״�͸��ֵ����״̬(״̬�� ״̬)
	{
		���״�͸��ֵ����״̬����.add(״̬);
	}
	public void ��ӻ��״�͸�ٷֱ�����״̬(״̬�� ״̬)
	{
		���״�͸�ٷֱ�����״̬����.add(״̬);
	}
	public void ��ӻ��״�͸��ֵ����״̬(״̬�� ״̬)
	{
		���״�͸��ֵ����״̬����.add(״̬);
	}
	public void ��ӻ��״�͸�ٷֱȼ���״̬(״̬�� ״̬)
	{
		���״�͸�ٷֱȼ���״̬����.add(״̬);
	}
	public void ��ӷ�����͸��ֵ����״̬(״̬�� ״̬)
	{
		������͸��ֵ����״̬����.add(״̬);
	}
	public void ��ӷ�����͸�ٷֱ�����״̬(״̬�� ״̬)
	{
		������͸�ٷֱ�����״̬����.add(״̬);
	}
	public void ��ӷ�����͸��ֵ����״̬(״̬�� ״̬)
	{
		������͸��ֵ����״̬����.add(״̬);
	}
	public void ��ӷ�����͸�ٷֱȼ���״̬(״̬�� ״̬)
	{
		������͸�ٷֱȼ���״̬����.add(״̬);
	}
	public void ������������ʩ��״̬(��������ʩ��״̬�� ��������ʩ��״̬)
	{
		if (this.��������ʩ��״̬ != null)
		{
			this.��������ʩ��״̬.��֪ͨ�����(this);
		}
		this.��������ʩ��״̬ = ��������ʩ��״̬; 
	}
	public void ��ӱ��������ͷ�״̬(���������ͷ�״̬�� ״̬)
	{
		���������ͷ�״̬����.add(״̬);
	}
	public void �������͵ȡ����״̬(״̬�� ״̬)
	{
		����͵ȡ����״̬����.add(״̬);
	}
	public void �������͵ȡ����״̬(״̬�� ״̬)
	{
		����͵ȡ����״̬����.add(״̬);
	}
	public void ��ӱ�����������״̬(״̬�� ״̬)
	{
		������������״̬����.add(״̬);
	}
	public void ��ӱ������ʼ���״̬(״̬�� ״̬)
	{
		�������ʼ���״̬����.add(״̬);
	}
	public void ��ӷ�����Ѫ����״̬(״̬�� ״̬)
	{
		������Ѫ����״̬����.add(״̬);
	}
	public void �������״̬(����״̬�� ״̬, ���������� ��������)
	{
		����״̬����.add(״̬);
		if (�������� == null)
		{
			������װ����.ʵ��.�������(new ��������������(is�ҷ�, Ӣ������λ��, is��ս������()));
		}
		else
		{
			��������.�������(new ��������������(is�ҷ�, Ӣ������λ��, is��ս������()));
		}
	}
	public void ��ӷ�����Ѫ����״̬(״̬�� ״̬)
	{
		������Ѫ����״̬����.add(״̬);
	}
	public void �����������״̬(״̬�� ״̬)
	{
		��������״̬����.add(״̬);
	}
	public void ������Լ���״̬(״̬�� ״̬)
	{
		���Լ���״̬����.add(״̬);
	}
	public void ����˺�����״̬(״̬�� ״̬)
	{
		�˺�����״̬����.add(״̬);
	}
	public void ��ӻ���״̬(����״̬�� ״̬)
	{
		����״̬����.add(״̬);
	}
	public void ���ħ������״̬(����״̬�� ״̬)
	{
		ħ������״̬����.add(״̬);
	}
	public void ����޵�״̬(����״̬�� ״̬)
	{
		�޵�״̬����.add(״̬);
	}
	public void ��ӵз�����״̬������Ӣ��״̬(�з�����״̬������Ӣ��״̬�� ״̬)
	{
		�з�����״̬������Ӣ��״̬����.add(״̬);
	}
	public void ��������˺�����״̬(״̬�� ״̬)
	{
		�����˺�����״̬����.add(״̬);
	}
	public void ���ħ���˺�����״̬(״̬�� ״̬)
	{
		ħ���˺�����״̬����.add(״̬);
	}
	public void �������ֵ����״̬(����ֵ����״̬�� ״̬)
	{
		����ֵ����״̬����.add(״̬);
	}
	public void ��ӱ�ѹ��״̬(��ѹ��״̬�� ״̬, ���������� ��������)
	{
		��ѹ��״̬����.add(״̬);
		���㱻ѹ������();
		if (�������� == null)
		{
			������װ����.ʵ��.�������(new ����ѹ��������(is�ҷ�, Ӣ������λ��, ��ѹ��));
		}
		else
		{
			��������.�������(new ����ѹ��������(is�ҷ�, Ӣ������λ��, ��ѹ��));
		}
	}
	public void ��ӵз���Ӣ����������״̬(״̬�� ״̬)
	{
		�з���Ӣ����������״̬����.add(״̬);
	}
	public void �����ͨ��������Ч��״̬(��ͨ��������Ч��״̬�� ��ͨ��������Ч��״̬)
	{
		��ͨ��������Ч��״̬����.add(��ͨ��������Ч��״̬);
	}
	public void ��ӱ���ͨ��������Ч��״̬(����ͨ��������Ч��״̬�� ����ͨ��������Ч��״̬)
	{
		����ͨ��������Ч��״̬����.add(����ͨ��������Ч��״̬);
	}
	private void �Ƴ�״̬(Set<? extends ״̬��> ״̬����, Class<? extends ״̬��> ״̬����)
	{
		Iterator<? extends ״̬��> ������ = ״̬����.iterator();
		while (������.hasNext())
		{
			if (������.next().getClass() == ״̬����)
			{
				������.remove();
				break;
			}
		}
	}
	public void �Ƴ�����������״̬(Class<? extends ״̬��> ״̬����)
	{
		�Ƴ�״̬(����������״̬����, ״̬����);
	}
	public void �Ƴ�����������״̬(Class<? extends ״̬��> ״̬����)
	{
		�Ƴ�״̬(����������״̬����, ״̬����);
	}
	public void �Ƴ�����ǿ������״̬(Class<? extends ״̬��> ״̬����)
	{
		�Ƴ�״̬(����ǿ������״̬����, ״̬����);
	}
	public void �Ƴ�����ǿ�ȼ���״̬(Class<? extends ״̬��> ״̬����)
	{
		�Ƴ�״̬(����ǿ�ȼ���״̬����, ״̬����);
	}
	public void �Ƴ�����ֵ����״̬(Class<? extends ״̬��> ״̬����)
	{
		�Ƴ�״̬(����ֵ����״̬����, ״̬����);
	}
	public void �Ƴ�����ֵ��������״̬(Class<? extends ״̬��> ״̬����)
	{
		�Ƴ�״̬(����ֵ����״̬����, ״̬����);
	}
	public void �Ƴ�����ֵ����״̬(Class<? extends ״̬��> ״̬����)
	{
		�Ƴ�״̬(����ֵ����״̬����, ״̬����);
	}
	public void �Ƴ�����ֵ����״̬(Class<? extends ״̬��> ״̬����)
	{
		�Ƴ�״̬(����ֵ����״̬����, ״̬����);
	}
	public void �Ƴ������ٶ�����״̬(Class<? extends ״̬��> ״̬����)
	{
		�Ƴ�״̬(�����ٶ�����״̬����, ״̬����);
	}
	public void �Ƴ��˺�����״̬(Class<? extends ״̬��> ״̬����)
	{
		�Ƴ�״̬(�˺�����״̬����, ״̬����);
	}
	public void �Ƴ�����͵ȡ����״̬(Class<? extends ״̬��> ״̬����)
	{
		�Ƴ�״̬(����͵ȡ����״̬����, ״̬����);
	}
	public void �Ƴ�����״̬(Class<? extends ״̬��> ״̬����, ���������� ��������)
	{
		�Ƴ�״̬(����״̬����, ״̬����);
		if (�������� == null)
		{
			������װ����.ʵ��.�������(new ��������������(is�ҷ�, Ӣ������λ��, is��ս������()));
		}
		else
		{
			��������.�������(new ��������������(is�ҷ�, Ӣ������λ��, is��ս������()));
		}
	}
	public void �Ƴ���ѹ��״̬(Class<? extends ״̬��> ״̬����, ���������� ��������)
	{
		�Ƴ�״̬(��ѹ��״̬����, ״̬����);
		if (�������� == null)
		{
			������װ����.ʵ��.�������(new ����ѹ��������(is�ҷ�, Ӣ������λ��, is��ս�б�ѹ��()));
		}
		else
		{
			��������.�������(new ����ѹ��������(is�ҷ�, Ӣ������λ��, is��ս�б�ѹ��()));
		}
	}
	public void ��ù�����������(int �������غ���)
	{
		��ù�����������״̬����.add(new ��ù�����������״̬��(�������غ���));
	}
	public void ����Ĭ(int �������غ���, ���������� ��������)
	{
		����Ĭ״̬����.add(new ����Ĭ״̬��(�������غ���));
		���㱻��Ĭ����();
		if (�������� == null)
		{
			������װ����.ʵ��.�������(new ���ó�Ĭ������(is�ҷ�, Ӣ������λ��, ����Ĭ));
		}
		else
		{
			��������.�������(new ���ó�Ĭ������(is�ҷ�, Ӣ������λ��, ����Ĭ));
		}
	}
	public void ������(int �������غ���, ���������� ��������)
	{
		������״̬����.add(new ������״̬��(�������غ���));
		���㱻��������();
		if (�������� == null)
		{
			������װ����.ʵ��.�������(new ���ñ���������(is�ҷ�, Ӣ������λ��, ������));
		}
		else
		{
			��������.�������(new ���ñ���������(is�ҷ�, Ӣ������λ��, ������));
		}
	}
	public void ������(int �������غ���, ���������� ��������)
	{
		������״̬����.add(new ������״̬��(�������غ���));
		���㱻��������();
		if (�������� == null)
		{
			������װ����.ʵ��.�������(new ���û���������(is�ҷ�, Ӣ������λ��, ������));
		}
		else
		{
			��������.�������(new ���û���������(is�ҷ�, Ӣ������λ��, ������));
		}
	}
	public void ������(int �������غ���, ���������� ��������)
	{
		������״̬����.add(new ������״̬��(�������غ���));
		���㱻��������();
		if (�������� == null)
		{
			������װ����.ʵ��.�������(new ���ó���������(is�ҷ�, Ӣ������λ��, ������));
		}
		else
		{
			��������.�������(new ���ó���������(is�ҷ�, Ӣ������λ��, ������));
		}
	}
	public void ��ѣ��(int �������غ���, ���������� ��������)
	{
		��ѣ��״̬����.add(new ��ѣ��״̬��(�������غ���));
		���㱻ѣ������();
		if (�������� == null)
		{
			������װ����.ʵ��.�������(new ����ѣ��������(is�ҷ�, Ӣ������λ��, ��ѣ��));
		}
		else
		{
			��������.�������(new ����ѣ��������(is�ҷ�, Ӣ������λ��, ��ѣ��));
		}
	}
	public void ����ä(int �������غ���, ���������� ��������)
	{
		����ä״̬����.add(new ����ä״̬��(�������غ���));
		���㱻��ä����();
		if (�������� == null)
		{
			������װ����.ʵ��.�������(new ������ä������(is�ҷ�, Ӣ������λ��, ����ä));
		}
		else
		{
			��������.�������(new ������ä������(is�ҷ�, Ӣ������λ��, ����ä));
		}
	}
	public void ����(int �������غ���, ���������� ��������)
	{
		����״̬����.add(new ����״̬��(�������غ���));
		������������();
		if (�������� == null)
		{
			������װ����.ʵ��.�������(new ��������������(is�ҷ�, Ӣ������λ��, is����));
		}
		else
		{
			��������.�������(new ��������������(is�ҷ�, Ӣ������λ��, is����));
		}
	}
	/**
	 * @param ���ٵ�����ֵ ����
	 * @param �������� ��Ϊnull����ֱ����ӵ���ս��Ļ������ 
	 * @return ʵ�ʼ��ٵ�����ֵ ����
	 */
	private int ��������ֵ(��ս��Ӣ���� �����ͷ���, int ���ٵ�����ֵ, ���������� ��������)
	{
		boolean is���벢���������Ϊnull = �������� == null;
		int ���ٺ�����ֵ = ����ֵ + ���ٵ�����ֵ;
		// ���ٺ�����ֵ����С��0
		if (���ٺ�����ֵ  <= 0)
		{
			���ٵ�����ֵ = ����ֵ;
			���ٺ�����ֵ = 0;
		}
		int ʵ�ʼ��ٵ�����ֵ  = ����ֵ - ���ٺ�����ֵ;
		����ֵ = ���ٺ�����ֵ;
		if (ʵ�ʼ��ٵ�����ֵ > 0)
		{
			Gdx.app.debug("��ս��Ӣ����.��������ֵ",String.format("ʵ�ʼ�������ֵ%d\n",  ʵ�ʼ��ٵ�����ֵ));
			if (�������� == null)
			{
				�������� = new ����������();
				if (is�ҷ�)
				{
					��������.�������(new ��Ѫ������(��ս��Ļ��.�ҷ�X��������[Ӣ������λ��-1], ��ս��Ļ��.�ҷ�Y��������[Ӣ������λ��-1], ʵ�ʼ��ٵ�����ֵ));
				}
				else
				{
					��������.�������(new ��Ѫ������(��ս��Ļ��.�з�X��������[Ӣ������λ��-1], ��ս��Ļ��.�з�Y��������[Ӣ������λ��-1], ʵ�ʼ��ٵ�����ֵ));
				}
				��������.�������(new �������ζ�������(is�ҷ�, Ӣ������λ��));
				��������.�������(new ����Ӣ��Ѫ��������(is�ҷ�, Ӣ������λ��, ����ֵ * 1f / get��ս���������ֵ()));
			}
			else
			{
				if (is�ҷ�)
				{
					��������.�������(new ��Ѫ������(��ս��Ļ��.�ҷ�X��������[Ӣ������λ��-1], ��ս��Ļ��.�ҷ�Y��������[Ӣ������λ��-1], ʵ�ʼ��ٵ�����ֵ));
				}
				else
				{
					��������.�������(new ��Ѫ������(��ս��Ļ��.�з�X��������[Ӣ������λ��-1], ��ս��Ļ��.�з�Y��������[Ӣ������λ��-1], ʵ�ʼ��ٵ�����ֵ));
				}
				��������.�������(new �������ζ�������(is�ҷ�, Ӣ������λ��));
				��������.�������(new ����Ӣ��Ѫ��������(is�ҷ�, Ӣ������λ��, ����ֵ * 1f / get��ս���������ֵ()));
			}
		}
		if (����ֵ == 0)
		{
			���� = true;
			��������.��֪ͨ���һ�ι�����ɱ�������Ӣ������(this);
			����ʩ�������();
			�����ͷ���.��ɱ��++;
			Gdx.app.debug("��ս��Ӣ����.��������ֵ",String.format("%s��ɱ����һ��Ϊ:%d\n", �����ͷ���.get����������λ��Ӣ������(), �����ͷ���.��ɱ��));
			��������״̬����Ч��(��������);
			��������.�������(new Ӣ������������(�����ͷ���.��ɱ��, is�ҷ�, Ӣ������λ�� - 1, Ӣ��.get������Ч�ļ���()));
			if (is���벢���������Ϊnull)
			{
				������װ����.ʵ��.�������(��������);
			}
			// Ӣ���������ս��û��Ӱ������ͷ��ڴ�
			�ͷ��ڴ�();
		}
		return ʵ�ʼ��ٵ�����ֵ;
	}
	/**
	 * @param ���ӵ�����ֵ ����
	 */
	private int ��������ֵ(int ���ӵ�����ֵ)
	{
		�����������ֵ();
		int �������ֵ = ��ս��Ӣ������.get�������ֵ();
		int ���Ӻ�����ֵ = ����ֵ + ���ӵ�����ֵ;
		// ����������ֵ���ܴ����������ֵ
		if (���Ӻ�����ֵ > �������ֵ)
		{
			���Ӻ�����ֵ = �������ֵ;
		}
		int ʵ����������ֵ = ���Ӻ�����ֵ - ����ֵ;
		if (ʵ����������ֵ > 0)
		{
			Gdx.app.debug("��ս��Ӣ����.��������ֵ",String.format("ʵ����������ֵ%d\n",  ʵ����������ֵ));
			����ֵ = ���Ӻ�����ֵ;
		}
		return ʵ����������ֵ;
	}
	/**
	 * @param ���ӵ�����ֵ ����
	 * @param ���л�Ѫ���� ��Ҫ��ʾΪ���л�Ѫʱ����ֵ��������null����
	 */
	public int ��������ֵ(int ���ӵ�����ֵ, ���������� ���л�Ѫ����)
	{
		int ʵ����������ֵ = ��������ֵ(���ӵ�����ֵ);
		if (ʵ����������ֵ > 0)
		{
			if (���л�Ѫ���� != null)
			{
				if (is�ҷ�)
				{
					���л�Ѫ����.�������(new ��Ѫ������(��ս��Ļ��.�ҷ�X��������[Ӣ������λ��-1], ��ս��Ļ��.�ҷ�Y��������[Ӣ������λ��-1], ʵ����������ֵ));
				}
				else
				{
					���л�Ѫ����.�������(new ��Ѫ������(��ս��Ļ��.�з�X��������[Ӣ������λ��-1], ��ս��Ļ��.�з�Y��������[Ӣ������λ��-1], ʵ����������ֵ));
				}
				���л�Ѫ����.�������(new ����Ӣ��Ѫ��������(is�ҷ�, Ӣ������λ��, ����ֵ * 1f / get��ս���������ֵ()));
			}
			else
			{
				���л�Ѫ���� = new ����������();
				if (is�ҷ�)
				{
					���л�Ѫ����.�������(new ��Ѫ������(��ս��Ļ��.�ҷ�X��������[Ӣ������λ��-1], ��ս��Ļ��.�ҷ�Y��������[Ӣ������λ��-1], ʵ����������ֵ));
				}
				else
				{
					���л�Ѫ����.�������(new ��Ѫ������(��ս��Ļ��.�з�X��������[Ӣ������λ��-1], ��ս��Ļ��.�з�Y��������[Ӣ������λ��-1], ʵ����������ֵ));
				}
				���л�Ѫ����.�������(new ����Ӣ��Ѫ��������(is�ҷ�, Ӣ������λ��, ����ֵ * 1f / get��ս���������ֵ()));
				������װ����.ʵ��.�������(���л�Ѫ����);
			}
		}
		return ʵ����������ֵ;
	}
	// ������Ҫ��������Ϊnull����ʾJVM���Ի���������
	private void �ͷ��ڴ�()
	{
		Ӣ�����Ա仯 = null;
		��ս��Ӣ������ = null;
		Ӣ�� = null;
		����������״̬����.clear();
		����������״̬���� = null;
		����ǿ������״̬����.clear();
		����ǿ������״̬���� = null;
		����ֵ����״̬����.clear();
		����ֵ����״̬���� = null;
		����ֵ��������״̬����.clear();
		����ֵ��������״̬���� = null;
		����ֵ����״̬����.clear();
		����ֵ����״̬���� = null;
		�����ٶ�����״̬����.clear();
		�����ٶ�����״̬���� = null;
		ħ����������״̬����.clear();
		ħ����������״̬���� = null;
		�������ֵ����״̬����.clear();
		�������ֵ����״̬���� = null;
		����ֵ����״̬����.clear();
		����ֵ����״̬���� = null;
		�����ظ�����״̬����.clear();
		�����ظ�����״̬���� = null;
		���״�͸��ֵ����״̬����.clear();
		���״�͸��ֵ����״̬���� = null;
		���״�͸�ٷֱ�����״̬����.clear();
		���״�͸�ٷֱ�����״̬���� = null;
		������͸��ֵ����״̬����.clear();
		������͸��ֵ����״̬���� = null;
		������͸�ٷֱ�����״̬����.clear();
		������͸�ٷֱ�����״̬���� = null;
		����͵ȡ����״̬����.clear();
		����͵ȡ����״̬���� = null;
		������������״̬����.clear();
		������������״̬���� = null;
		������Ѫ����״̬����.clear();
		������Ѫ����״̬���� = null;
		��ù�����������״̬����.clear();
		��ù�����������״̬���� = null;
		����״̬����.clear();
		����״̬���� = null;
		����״̬����.clear();
		����״̬���� = null;
		��������״̬����.clear();
		��������״̬���� = null;
		����������״̬����.clear();
		����������״̬���� = null;
		����ǿ�ȼ���״̬����.clear();
		����ǿ�ȼ���״̬���� = null;
		����ֵ����״̬����.clear();
		����ֵ����״̬���� = null;
		����ֵ����״̬����.clear();
		����ֵ����״̬���� = null;
		����ä״̬����.clear();
		����ä״̬���� = null;
		������״̬����.clear();
		������״̬���� = null;
		�����ٶȼ���״̬����.clear();
		�����ٶȼ���״̬���� = null;
		ħ�����Լ���״̬����.clear();
		ħ�����Լ���״̬���� = null;
		�������ֵ����״̬����.clear();
		�������ֵ����״̬���� = null;
		����ֵ����״̬����.clear();
		����ֵ����״̬���� = null;
		�����ظ�����״̬����.clear();
		�����ظ�����״̬���� = null;
		���״�͸��ֵ����״̬����.clear();
		���״�͸��ֵ����״̬���� = null;
		������͸��ֵ����״̬����.clear();
		������͸��ֵ����״̬���� = null;
		���״�͸�ٷֱȼ���״̬����.clear();
		���״�͸�ٷֱȼ���״̬���� = null;
		������͸�ٷֱȼ���״̬����.clear();
		������͸�ٷֱȼ���״̬���� = null;
		����͵ȡ����״̬����.clear();
		����͵ȡ����״̬���� = null;
		�������ʼ���״̬����.clear();
		�������ʼ���״̬���� = null;
		������Ѫ����״̬����.clear();
		������Ѫ����״̬���� = null;
		���Լ���״̬����.clear();
		���Լ���״̬���� = null;
		�˺�����״̬����.clear();
		�˺�����״̬���� = null;
		�����˺�����״̬����.clear();
		�����˺�����״̬���� = null;
		ħ���˺�����״̬����.clear();
		ħ���˺�����״̬���� = null;
		����ֵ����״̬����.clear();
		����ֵ����״̬���� = null;
		����Ĭ״̬����.clear();
		����Ĭ״̬���� = null;
		������״̬����.clear();
		������״̬���� = null;
		������״̬����.clear();
		������״̬���� = null;
		������״̬����.clear();
		������״̬���� = null;
		��ѣ��״̬����.clear();
		��ѣ��״̬���� = null;
		�з���Ӣ����������״̬����.clear();
		�з���Ӣ����������״̬���� = null;
		��ͨ��������Ч��״̬����.clear();
		��ͨ��������Ч��״̬���� = null;
		����ͨ��������Ч��״̬����.clear();
		����ͨ��������Ч��״̬���� = null;
		����״̬����.clear();
		����״̬���� = null;
		ħ������״̬����.clear();
		ħ������״̬���� = null;
		�޵�״̬����.clear();
		�޵�״̬���� = null;
		�з�����״̬������Ӣ��״̬����.clear();
		�з�����״̬������Ӣ��״̬���� = null;
		��������ʩ��״̬ = null;
		���������ͷ�״̬����.clear();
		���������ͷ�״̬���� = null;
		�������� = null;
	}
	private void �����������ֵ()
	{
		�����������ֵ���Ա仯();
		int ��ս���������ֵ = ������.����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(get��ʼ�������ֵ(), Ӣ�����Ա仯.get�������ֵ��ֵ�仯(), Ӣ�����Ա仯.get�������ֵ�ٷֱȱ仯());
		��ս��Ӣ������.set�������ֵ(��ս���������ֵ);
	}
	private void ���㷨��ǿ��()
	{
		���㷨��ǿ�����Ա仯();
		int ��ս�з���ǿ�� = ������.����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(get��ʼ����ǿ��(), Ӣ�����Ա仯.get����ǿ����ֵ�仯(), Ӣ�����Ա仯.get����ǿ�Ȱٷֱȱ仯());
		��ս��Ӣ������.set����ǿ��(��ս�з���ǿ��);
	}
	private void ����ħ������()
	{
		����ħ���������Ա仯();
		int ��ս��ħ������ = ������.����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(get��ʼħ������(), Ӣ�����Ա仯.getħ��������ֵ�仯(), Ӣ�����Ա仯.getħ�����԰ٷֱȱ仯());
		��ս��Ӣ������.setħ������(��ս��ħ������);
	}
	private void ������ֵ������͸()
	{
		������ֵ������͸���Ա仯();
		int ��ս����ֵ������͸ = ������.����_��ֵ�仯_����ֵ(get��ʼ��ֵ������͸(), Ӣ�����Ա仯.get��ֵ������͸�仯());
		��ս��Ӣ������.set��ֵ������͸(��ս����ֵ������͸);
	}
	private void ����ٷֱȷ�����͸()
	{
		����ٷֱȷ�����͸���Ա仯();
		float ��ս�аٷֱȷ�����͸ = ������.��ʼ�ٷֱ�_�ٷֱȱ仯_���(get��ʼ�ٷֱȷ�����͸(), Ӣ�����Ա仯.get�ٷֱȷ�����͸�仯());
		��ս��Ӣ������.set�ٷֱȷ�����͸(��ս�аٷֱȷ�����͸);
	}
	private void ��������͵ȡ()
	{
		��������͵ȡ���Ա仯();
		float ��ս������͵ȡ = ������.��ʼ�ٷֱ�_�ٷֱȱ仯_���(get��ʼ����͵ȡ(), Ӣ�����Ա仯.get����͵ȡ�ٷֱȱ仯());
		��ս��Ӣ������.set����͵ȡ(��ս������͵ȡ);
	}
	private void ���㱩������()
	{
		���㱩���������Ա仯();
		float ��ս�б������� = ������.��ʼ�ٷֱ�_�ٷֱȱ仯_���(get��ʼ��������(), Ӣ�����Ա仯.get�������ʰٷֱȱ仯());
		��ս��Ӣ������.set��������(��ս�б�������);
	}
	private void ���㷨����Ѫ()
	{
		���㷨����Ѫ���Ա仯();
		float ��ս�з�����Ѫ = ������.��ʼ�ٷֱ�_�ٷֱȱ仯_���(get��ʼ������Ѫ(), Ӣ�����Ա仯.get������Ѫ�ٷֱȱ仯());
		��ս��Ӣ������.set������Ѫ(��ս�з�����Ѫ);
	}
	private void ��������()
	{
		�����������Ա仯();
		float ��ս������ = ������.��ʼ�ٷֱ�_�ٷֱȱ仯_���(get��ʼ����(), Ӣ�����Ա仯.get���԰ٷֱȱ仯());
		��ս��Ӣ������.set����(��ս������);
	}
	private void ������ֵ���״�͸()
	{
		������ֵ���״�͸���Ա仯();
		int ��ս����ֵ���״�͸ = ������.����_��ֵ�仯_����ֵ(get��ʼ��ֵ���״�͸(), Ӣ�����Ա仯.get��ֵ���״�͸�仯());
		��ս��Ӣ������.set��ֵ���״�͸(��ս����ֵ���״�͸);
	}
	private void ����ٷֱȻ��״�͸()
	{
		����ٷֱȻ��״�͸���Ա仯();
		float ��ս�аٷֱȻ��״�͸ = ������.��ʼ�ٷֱ�_�ٷֱȱ仯_���(get��ʼ�ٷֱȻ��״�͸(), Ӣ�����Ա仯.get�ٷֱȻ��״�͸�仯());
		��ս��Ӣ������.set�ٷֱȻ��״�͸(��ս�аٷֱȻ��״�͸);
	}
	private void ���㻤��ֵ()
	{
		���㻤�����Ա仯();
		int ��ս�л��� = ������.����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(get��ʼ����ֵ(), Ӣ�����Ա仯.get������ֵ�仯(), Ӣ�����Ա仯.get���װٷֱȱ仯());
		��ս��Ӣ������.set����ֵ(��ս�л���);
	}
	private void ���㹥����()
	{
		���㹥�������Ա仯();
		int ��ս�й����� = ������.����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(get��ʼ������(), Ӣ�����Ա仯.get��������ֵ�仯(), Ӣ�����Ա仯.get�������ٷֱȱ仯());
		��ս��Ӣ������.set������(��ս�й�����);
	}
	private void ���㹥���ٶ�()
	{
		���㹥���ٶ����Ա仯();
		float ��ս�й����ٶ� = ������.��ʼ�ٷֱ�_�ٷֱȱ仯_���(get��ʼ�����ٶ�(), Ӣ�����Ա仯.get�����ٶȰٷֱȱ仯());
		��ս��Ӣ������.set�����ٶ�(��ս�й����ٶ�);
	}
	private void ��������ֵ()
	{
		if (!is��ս������ֵ����())
		{
			��������ֵ���Ա仯();
			int ��ս������ֵ = ������.����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(get��ʼ����ֵ(), Ӣ�����Ա仯.get����ֵ��ֵ�仯(), Ӣ�����Ա仯.get����ֵ�ٷֱȱ仯());
			��ս��Ӣ������.set����ֵ(��ս������ֵ);
		}
		else
		{
			��ս��Ӣ������.set����ֵ(0);
		}
	}
	private void ���������ظ�()
	{
		���������ظ����Ա仯();
		��ս��Ӣ������.set�����ظ�(������.����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(get��ʼ�����ظ�(), Ӣ�����Ա仯.get�����ظ���ֵ�仯(), Ӣ�����Ա仯.get�����ظ��ٷֱȱ仯()));
	}
	private void ���㹥�������Ա仯()
	{
		Ӣ�����Ա仯.���ù�������ֵ�仯();
		Ӣ�����Ա仯.���ù������ٷֱȱ仯();
		for (״̬�� ״̬ : ����������״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : ����������״̬����)
		{
			״̬.����(this);
		}
	}
	private void ���㷨��ǿ�����Ա仯()
	{
		Ӣ�����Ա仯.���÷���ǿ����ֵ�仯();
		Ӣ�����Ա仯.���÷���ǿ�Ȱٷֱȱ仯();
		for (״̬�� ״̬ : ����ǿ������״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : ����ǿ�ȼ���״̬����)
		{
			״̬.����(this);
		}
	}
	private void ��������ֵ���Ա仯()
	{
		Ӣ�����Ա仯.��������ֵ��ֵ�仯();
		Ӣ�����Ա仯.��������ֵ�ٷֱȱ仯();
		for (״̬�� ״̬ : ����ֵ����״̬����)
		{
			״̬.����(this);
		}
		��������ֵ������������();
		if (!is����ֵ��������)
		{
			for (״̬�� ״̬ : ����ֵ����״̬����)
			{
				״̬.����(this);
			}
		}
	}
	private void ���㻤�����Ա仯()
	{
		Ӣ�����Ա仯.���û���ֵ��ֵ�仯();
		Ӣ�����Ա仯.���û���ֵ�ٷֱȱ仯();
		for (״̬�� ״̬ : ����ֵ����״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : ����ֵ����״̬����)
		{
			״̬.����(this);
		}
	}
	private void ���㱻��ä����()
	{
		����ä = false;
		for (״̬�� ״̬ : ����ä״̬����)
		{
			״̬.����(this);
		}
	}
	private void ���㹥���ٶ����Ա仯()
	{
		Ӣ�����Ա仯.���ù����ٶȱ仯();
		for (״̬�� ״̬ : �����ٶ�����״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : �����ٶȼ���״̬����)
		{
			״̬.����(this);
		}
	}
	private void ����ħ���������Ա仯()
	{
		Ӣ�����Ա仯.����ħ��������ֵ�仯();
		Ӣ�����Ա仯.����ħ�����԰ٷֱȱ仯();
		for (״̬�� ״̬ : ħ����������״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : ħ�����Լ���״̬����)
		{
			״̬.����(this);
		}
	}
	private void �����������ֵ���Ա仯()
	{
		Ӣ�����Ա仯.�����������ֵ��ֵ�仯();
		Ӣ�����Ա仯.�����������ֵ�ٷֱȱ仯();
		for (״̬�� ״̬ : �������ֵ����״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : �������ֵ����״̬����)
		{
			״̬.����(this);
		}
	}
	private void ���������ظ����Ա仯()
	{
		Ӣ�����Ա仯.���������ظ���ֵ�仯();
		Ӣ�����Ա仯.���������ظ��ٷֱȱ仯();
		for (״̬�� ״̬ : �����ظ�����״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : �����ظ�����״̬����)
		{
			״̬.����(this);
		}
	}
	private void ������ֵ���״�͸���Ա仯()
	{
		Ӣ�����Ա仯.���û��״�͸��ֵ�仯();
		for (״̬�� ״̬ : ���״�͸��ֵ����״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : ���״�͸��ֵ����״̬����)
		{
			״̬.����(this);
		}
	}
	private void ����ٷֱȻ��״�͸���Ա仯()
	{
		Ӣ�����Ա仯.���û��״�͸�ٷֱȱ仯();
		for (״̬�� ״̬ : ���״�͸�ٷֱ�����״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : ���״�͸�ٷֱȼ���״̬����)
		{
			״̬.����(this);
		}
	}
	private void ������ֵ������͸���Ա仯()
	{
		Ӣ�����Ա仯.���÷�����͸��ֵ�仯();
		for (״̬�� ״̬ : ������͸��ֵ����״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : ������͸��ֵ����״̬����)
		{
			״̬.����(this);
		}
	}
	private void ����ٷֱȷ�����͸���Ա仯()
	{
		Ӣ�����Ա仯.���÷�����͸�ٷֱȱ仯();
		for (״̬�� ״̬ : ������͸�ٷֱ�����״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : ������͸�ٷֱȼ���״̬����)
		{
			״̬.����(this);
		}
	}
	private void �����ù�����������()
	{
		is��ù����������� = false;
		for (״̬�� ״̬ : ��ù�����������״̬����)
		{
			״̬.����(this);
		}
	}
	private void ��������͵ȡ���Ա仯()
	{
		Ӣ�����Ա仯.��������͵ȡ�仯();
		for (״̬�� ״̬ : ����͵ȡ����״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : ����͵ȡ����״̬����)
		{
			״̬.����(this);
		}
	}
	private void ���㱩���������Ա仯()
	{
		Ӣ�����Ա仯.���ñ������ʱ仯();
		for (״̬�� ״̬ : ������������״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : �������ʼ���״̬����)
		{
			״̬.����(this);
		}
	}
	private void ���㷨����Ѫ���Ա仯()
	{
		Ӣ�����Ա仯.���÷�����Ѫ�仯();
		for (״̬�� ״̬ : ������Ѫ����״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : ������Ѫ����״̬����)
		{
			״̬.����(this);
		}
	}
	private void ������������()
	{
		is���� = false;
		for (״̬�� ״̬ : ����״̬����)
		{
			״̬.����(this);
		}
	}
	private void ���㱻������()
	{
		��ս�б������� = ������״̬��.���δ��������;
		for (״̬�� ״̬ : ������״̬����)
		{
			״̬.����(this);
		}
	}
	private void ������������()
	{
		is���� = false;
		for (״̬�� ״̬ : ����״̬����)
		{
			״̬.����(this);
		}
	}
	private void �����������Ա仯()
	{
		Ӣ�����Ա仯.�������Ա仯();
		for (״̬�� ״̬ : ��������״̬����)
		{
			״̬.����(this);
		}
		for (״̬�� ״̬ : ���Լ���״̬����)
		{
			״̬.����(this);
		}
	}
	private void �����˺���������()
	{
		�˺���ֵ���� = 0;
		�˺��ٷֱȼ��� = 0;
		for (״̬�� ״̬ : �˺�����״̬����)
		{
			״̬.����(this);
		}
	}
	private void ���������˺���������()
	{
		�����˺���ֵ���� = 0;
		�����˺��ٷֱȼ��� = 0;
		for (״̬�� ״̬ : �����˺�����״̬����)
		{
			״̬.����(this);
		}
	}
	private void ����ħ���˺���������()
	{
		ħ���˺���ֵ���� = 0;
		ħ���˺��ٷֱȼ��� = 0;
		for (״̬�� ״̬ : ħ���˺�����״̬����)
		{
			״̬.����(this);
		}
	}
	private void ��������ֵ��������()
	{
		is����ֵ���� = false;
		for (״̬�� ״̬ : ����ֵ����״̬����)
		{
			״̬.����(this);
		}
	}
	private void ��������ֵ������������()
	{
		is����ֵ�������� = false;
		for (״̬�� ״̬ : ����ֵ��������״̬����)
		{
			״̬.����(this);
		}
	}
	private void ���㱻��Ĭ����()
	{
		����Ĭ = false;
		for (״̬�� ״̬ : ����Ĭ״̬����)
		{
			״̬.����(this);
		}
		if (����Ĭ)
		{
			����ʩ�������();
		}
	}
	private void ���㱻��������()
	{
		������ = false;
		for (״̬�� ״̬ : ������״̬����)
		{
			״̬.����(this);
		}
		if (������)
		{
			����ʩ�������();
		}
	}
	private void ���㱻��������()
	{
		������ = false;
		for (״̬�� ״̬ : ������״̬����)
		{
			״̬.����(this);
		}
		if (������)
		{
			����ʩ�������();
		}
	}
	private void ���㱻��������()
	{
		������ = false;
		for (״̬�� ״̬ : ������״̬����)
		{
			״̬.����(this);
		}
		if (������)
		{
			����ʩ�������();
		}
	}
	private void ���㱻ѣ������()
	{
		��ѣ�� = false;
		for (״̬�� ״̬ : ��ѣ��״̬����)
		{
			״̬.����(this);
		}
		if (��ѣ��)
		{
			����ʩ�������();
		}
	}
	private void ���㱻ѹ������()
	{
		��ѹ�� = false;
		for (״̬�� ״̬ : ��ѹ��״̬����)
		{
			״̬.����(this);
		}
		if (��ѹ��)
		{
			����ʩ�������();
		}
	}
	private void ����ʩ�������()
	{
		if (��������ʩ��״̬ != null)
		{
			��������ʩ��״̬.��������ʩ�������(this);
			��������ʩ��״̬ = null;
		}
	}
}