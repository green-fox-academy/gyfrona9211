page 50101 CalculationList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Calculation;
    CardPageId = CalculationCard;

    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;

                }
                field(SecondNumber; Rec.SecondNumber)
                {
                    ApplicationArea = All;

                }
                field(FirstNumber; Rec.FirstNumber)
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