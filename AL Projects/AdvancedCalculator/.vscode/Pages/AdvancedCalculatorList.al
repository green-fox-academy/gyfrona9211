page 50121 AdvancedCalList
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = AdvancedC;

    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(FirstNumber; Rec.FirstNumber)
                {
                    ApplicationArea = All;

                }
                field(Operator; Rec.Operator)
                {
                    ApplicationArea = All;

                }
                field(SecondNumber; Rec.SecondNumber)
                {
                    ApplicationArea = All;

                }
                field(Result; Rec.Result)
                {
                    ApplicationArea = All;

                }
            }
        }
    }


}